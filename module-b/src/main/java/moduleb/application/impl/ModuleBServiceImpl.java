package moduleb.application.impl;

import moduleb.application.ModuleBService;
import org.springframework.stereotype.Service;

@Service
public class ModuleBServiceImpl implements ModuleBService {

  // private ModuleBRepository moduleBRepository;

  @Override
  public String getMessageModuleB() {
    return " module-b!";
    // return moduleBRepository.getSqlMessage();
  }
}
