package api.pub.summoner;

import api.ApiBaseTest;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Test_Summoner extends ApiBaseTest {

    @DisplayName("Verify correct summoner information is returned")
    @ParameterizedTest(name = "Verify correct summoner information")
    @CsvFileSource(resources = "/csv/summoner/getSummoner.csv",
            numLinesToSkip = 1,
            lineSeparator = "~",
            delimiterString = "||")
    public void VerifyGetSummoner(String apiKey, String summonerName) {
        Response resp = new PubApi_Summoner().GetSummoner(apiKey, summonerName);
//        System.out.println(resp.prettyPrint());

        VerifyStatusCode("200", resp.statusCode());
    }
}
