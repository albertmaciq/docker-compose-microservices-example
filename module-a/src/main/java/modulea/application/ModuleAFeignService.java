package modulea.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "module-b", url = "http://module-b:8080")
public interface ModuleAFeignService {

  @GetMapping("/moduleB")
  String messageB();
}
