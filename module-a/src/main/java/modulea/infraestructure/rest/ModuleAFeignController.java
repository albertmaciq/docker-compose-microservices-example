package modulea.infraestructure.rest;

import modulea.application.ModuleAFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleAFeignController {

  @Autowired private final ModuleAFeignService service;

  public ModuleAFeignController(final ModuleAFeignService service) {
    this.service = service;
  }

  @GetMapping("/feinga")
  public String messageB() {
    return "Hello " + service.messageB();
  }
}
