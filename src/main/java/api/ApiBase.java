package api;

import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class ApiBase {
    public static final String env = System.getenv("env");

    @Step("Verify Status Code")
    public void VerifyStatusCode(String expectedCode, int actualCode) {
        Assertions.assertEquals(Integer.parseInt(expectedCode), actualCode);
    }
}
