package modulea.infraestructure.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ModuleAController {

  @Value("${moduleBUrl}")
  private String moduleBUrl;

  @GetMapping("/")
  public String messageModuleA() {
    RestTemplate restTemplate = new RestTemplate();
    String messageModuleB = restTemplate.getForObject(moduleBUrl, String.class);
    return "Hello " + messageModuleB;
  }
}
