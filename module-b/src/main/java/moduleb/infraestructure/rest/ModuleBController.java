package moduleb.infraestructure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleBController {
  @GetMapping("/moduleB")
  public String messageModuleB() {
    return " module-b!";
  }
}
