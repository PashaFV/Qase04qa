package tests;

import adapters.ProjectAdapter;
import io.restassured.response.Response;
import models.ErrorFields;
import models.Project;
import models.ResponseStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class ApiTest {

    @Test
    public void negativeApitest() {

        Project project = Project.builder()
                .title("blabla")
                .code("!!!")
                .build();
        ResponseStatus actual = new ProjectAdapter().post(project,422);
        ResponseStatus expected = ResponseStatus.builder()
                .status(false)
                .errorMessage("Data is invalid.")
                .build();

        assertEquals(actual,expected);
        assertEquals(actual.isStatus(),expected.isStatus());
        assertEquals(actual.getErrorMessage(),expected.getErrorMessage());


    }



}
