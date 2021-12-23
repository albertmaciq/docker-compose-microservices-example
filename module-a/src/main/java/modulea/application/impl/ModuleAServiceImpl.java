package modulea.application.impl;

import modulea.application.ModuleAService;
import modulea.infraestructure.rest.ModuleAController;
import org.springframework.beans.factory.annotation.Autowired;

public class ModuleAServiceImpl implements ModuleAService {

  @Autowired private ModuleAController moduleAController;

  @Override
  public String getMessageModuleA() {
    return moduleAController.messageModuleA();
  }
}
