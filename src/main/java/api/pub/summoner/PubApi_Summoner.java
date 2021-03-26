package api.pub.summoner;

import api.pub.ApiPublicBase;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PubApi_Summoner extends ApiPublicBase {

    @Step("Get Summoner information")
    public Response GetSummoner(String apiKey, String summonerName) {
        String url = publicApiUrl + "lol/summoner/v4/summoners/by-name/" + summonerName;

        return given()
                .header("X-Riot-Token", apiKey)
                .get(url);

    }
}
