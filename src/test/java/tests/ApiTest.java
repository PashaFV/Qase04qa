package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiTest {

    @Test
    public void testApi(){
        given().
                header("Token","012353711d7d9c144240b7b7ae8653d947d189bf").
                header("Content-Type","application/json");
        //body('{'title' : 'Testtms', 'code': "qweqw"}")
    }

}
