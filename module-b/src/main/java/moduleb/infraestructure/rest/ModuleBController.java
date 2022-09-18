package moduleb.infraestructure.rest;

import moduleb.application.ModuleBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleBController {

  @Autowired private ModuleBService moduleBService;

  @GetMapping("/moduleB")
  public String messageModuleB() {
    return moduleBService.getMessageModuleB();
  }
}
