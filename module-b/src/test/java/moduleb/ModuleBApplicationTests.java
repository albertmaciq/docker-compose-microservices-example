package moduleb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(initializers = DockerPostgreDataSourceInitializer.class)
@ActiveProfiles(profiles = "cloud")
class ModuleBApplicationTests {

  @Test
  void contextLoads() {}
}
