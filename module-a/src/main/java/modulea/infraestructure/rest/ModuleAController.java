package modulea.infraestructure.rest;

import modulea.application.ModuleAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleAController {

  @Autowired private ModuleAService moduleAService;

  private static final Logger LOGGER = LoggerFactory.getLogger(ModuleAController.class);

  @GetMapping("/")
  public String messageModuleA() {
    return moduleAService.getMessageModuleA();
  }

  @GetMapping("/services")
  public String services() {
    LOGGER.info("Discovery services: " + moduleAService.getServiceUrl());
    return moduleAService.getServiceUrl();
  }

  @GetMapping("/svc")
  public String svc() {
    return moduleAService.getMessageSvcCluster();
  }
}
