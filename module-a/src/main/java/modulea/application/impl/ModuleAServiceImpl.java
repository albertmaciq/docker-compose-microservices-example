package modulea.application.impl;

import java.util.Arrays;
import java.util.List;
import modulea.application.ModuleAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ModuleAServiceImpl implements ModuleAService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ModuleAServiceImpl.class);

  @Value("${docker.url}")
  private String moduleBUrl;

  @Value("${svc}")
  private String svc;

  @Autowired private Environment environment;

  @Autowired private DiscoveryClient discoveryClient;

  @Override
  public String getMessageModuleA() {
    LOGGER.info("Profile active: " + Arrays.toString(environment.getActiveProfiles()));

    RestTemplate restTemplate = new RestTemplate();
    String messageModuleB = restTemplate.getForObject(moduleBUrl, String.class);

    return "Hello " + messageModuleB;
  }

  private String discoveryService(final String appName) {
    System.out.println(appName);
    List<ServiceInstance> instances = this.discoveryClient.getInstances(appName);
    String url = "No services found";
    int i = 0;
    if (instances != null) {
      for (ServiceInstance instance : instances) {
        url = instances.get(i).getUri().toString();
        LOGGER.info("url: " + url);
        i++;
      }
    }
    return url;
  }

  @Override
  public String getServiceUrl() {
    return discoveryService("module-a");
  }

  @Override
  public String getMessageSvcCluster() {
    RestTemplate restTemplate = new RestTemplate();
    String messageModuleB = restTemplate.getForObject(svc, String.class);

    return "Hello" + messageModuleB;
  }
}
