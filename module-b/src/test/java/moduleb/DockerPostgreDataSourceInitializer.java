package moduleb;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.TestPropertySourceUtils;
import org.testcontainers.containers.PostgreSQLContainer;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DockerPostgreDataSourceInitializer
    implements ApplicationContextInitializer<ConfigurableApplicationContext> {

  public PostgreSQLContainer<?> postgreSQlContainer = new PostgreSQLContainer<>("postgres:latest");

  @Override
  public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
    postgreSQlContainer.start();

    TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
        configurableApplicationContext,
        "spring.datasource.url=" + postgreSQlContainer.getJdbcUrl(),
        "spring.datasource.username=" + postgreSQlContainer.getUsername(),
        "spring.datasource.password=" + postgreSQlContainer.getPassword());
  }
}
