package moduleb.application.impl;

import moduleb.application.ModuleBService;
import moduleb.infraestructure.rest.ModuleBController;
import org.springframework.beans.factory.annotation.Autowired;

public class ModuleBServiceImpl implements ModuleBService {

  @Autowired private ModuleBController moduleBController;

  @Override
  public String getMessageModuleB() {
    return moduleBController.messageModuleB();
  }
}
