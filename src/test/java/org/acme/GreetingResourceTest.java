package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void test1() {
        given()
          .when().get("/hello/test1")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: test property"));
    }

    @Test
    public void test2() {
        given()
          .when().get("/hello/test2")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: test property"));
    }

    @Test
    public void test3() {
        given()
          .when().get("/hello/test3")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: test property"));
    }

}