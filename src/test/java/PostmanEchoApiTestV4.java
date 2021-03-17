import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PostmanEchoApiTestV4 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("9")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("9"))

        ;
    }

    @Test
    void shouldReturnDemoAccountsNew() {
        // Given - When - Then
        // Предусловия
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("value"))


        ;
    }
}
