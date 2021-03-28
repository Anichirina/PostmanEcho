import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoApiTestV3 {

    @Test

    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data",equalTo("some data"))



        ;
        ;
    }

    @Test
    void shouldReturnDemoAccountsNew1() {
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
