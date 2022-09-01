package APITest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestFile {



    @Test(priority = 1)
    public void executeTest(){

        Response response = given().
                header("Content-Type", "application/json").
                when().get("https://jsonplaceholder.typicode.com/users").
                then().extract().response();
        System.out.println("Response: "+response.prettyPrint());
        Assert.assertEquals(200,response.statusCode());

    }


    @Test(priority = 2)
    public void executeTest2(){
        Response response = given().
                header("Content-Type", "application/json").
                when().get("https://jsonplaceholder.typicode.com/users").
                then().extract().response();
        System.out.println("Response: "+response.prettyPrint());
        Assert.assertEquals(400,response.statusCode());

    }
}
