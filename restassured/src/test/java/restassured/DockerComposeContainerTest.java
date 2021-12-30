package restassured;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.BDDAssertions.then;

import java.io.File;
import org.junit.ClassRule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.testcontainers.containers.DockerComposeContainer;

public class DockerComposeContainerTest {

  @Value("${url}")
  private String url;

  @ClassRule
  public static DockerComposeContainer compose =
      new DockerComposeContainer(new File("docker-compose.yml"))
          .withExposedService("module-a:latest", 80);

  @Test
  public void given_controller_when_get_module_a_endpoint_then_returns_message() throws Exception {
    String response = given().get(url).asPrettyString();
    System.out.println(url);
    then(response).isEqualTo("Hello module-b!");
  }
}
