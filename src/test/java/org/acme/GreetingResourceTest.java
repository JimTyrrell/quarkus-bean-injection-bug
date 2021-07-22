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
             .body(is("test Property from Greeting Resource: Member Variable"));
    }

    @Test
    public void test2a() {
        given()
          .when().get("/hello/test2a")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: Member Variable"));
    }

    @Test
    public void test2b() {
      given()
        .when().get("/hello/test2b")
        .then()
           .statusCode(200)
           .body(is("test Property from Greeting Resource: Member Variable"));
  }

  @Test
  public void test2aRegular() {
    given()
      .when().get("/hello/test2a-regular")
      .then()
         .statusCode(200)
         .body(is("test Property from Greeting Resource: Member Variable"));
}

@Test
public void test2bRegular() {
  given()
    .when().get("/hello/test2b-regular")
    .then()
       .statusCode(200)
       .body(is("test Property from Greeting Resource: Member Variable"));
}

@Test
public void test2aNew() {
  given()
    .when().get("/hello/test2a-new")
    .then()
       .statusCode(200)
       .body(is("test Property from Greeting Resource: Member Variable"));
}

@Test
public void test2bNew() {
given()
  .when().get("/hello/test2b-new")
  .then()
     .statusCode(200)
     .body(is("test Property from Greeting Resource: Member Variable"));
}

  @Test
    public void test1Static() {
        given()
          .when().get("/hello/test1-static")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: Static Member Variable"));
    }

    @Test
    public void test2aStatic() {
        given()
          .when().get("/hello/test2a-static")
          .then()
             .statusCode(200)
             .body(is("test Property from Greeting Resource: Static Member Variable"));
    }

    @Test
    public void test2bStatic() {
      given()
        .when().get("/hello/test2b-static")
        .then()
           .statusCode(200)
           .body(is("test Property from Greeting Resource: Static Member Variable"));
  }

  


}