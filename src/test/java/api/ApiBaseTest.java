package api;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class ApiBaseTest extends ApiBase {

    @Step("Compare json response information for reply")
    public void VerifyFullJsonResponse(String json, String reply) {
        Assertions.assertEquals(json.trim().replaceAll("\\r\\n?","\n"),reply.trim().replaceAll("\\r\\n?", "\n"),
                "Could not verify the JSON information provided appears in the response");
    }
}
