package tests;

import adapters.ProjectAdapter;
import models.*;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import static org.testng.Assert.assertEquals;

public class ApiTest {

    @Test(description = "Negative create project by code test")
    public void negativeApitest() {

        Project project = Project.builder()
                .title("blabla")
                .code("!!!")
                .build();
        ResponseStatus actual = new ProjectAdapter().post(project, 422);
        ResponseStatus expected = ResponseStatus.builder()
                .status(false)
                .errorMessage("Data is invalid.")
                .build();

        assertEquals(actual, expected);
        assertEquals(actual.isStatus(), expected.isStatus());
        assertEquals(actual.getErrorMessage(), expected.getErrorMessage());

    }

    @Test(description = "Negative get project by code test")
    public void getProjectWithInvalidCode() {

        ResponseStatus actual = new ProjectAdapter().getProject(404, "AZXXZZZ");
        ResponseStatus expected = ResponseStatus.builder()
                .status(false)
                .errorMessage("Project is not found.")
                .build();

        assertEquals(actual, expected);
        assertEquals(actual.isStatus(), expected.isStatus());
        assertEquals(actual.getErrorMessage(), expected.getErrorMessage());
    }

    @Test(description = "Positive get empty project by code test")
    public void getProjectWithoutCases() {

        ResponseStatus actual = new ProjectAdapter().getProject(200, "B000I6QKZU");
        ResponseStatus expected = ResponseStatus.builder()
                .status(true)
                .result(Result.builder()
                        .title("No Country for Old Men")
                        .code("B000I6QKZU")
                        .counts(Counts.builder()
                                .cases(0)
                                .suites(0)
                                .milestones(0)
                                .runs(Runs.builder()
                                        .total(0)
                                        .active(0)
                                        .build())
                                .defects(Defects.builder()
                                        .total(0)
                                        .open(0)
                                        .build())
                                .build())
                        .build()
                )
                .build();
        assertEquals(actual, expected);
        assertEquals(actual.isStatus(), expected.isStatus());
    }

    @Test(description = "Positive get project with cases by code test")
    public void getProjectWithCases() {
        ResponseStatus actual = new ProjectAdapter().getProject(200, "B000HU7P92");
        ResponseStatus expected = ResponseStatus.builder()
                .status(true)
                .result(
                        Result.builder()
                                .title("Mr Standfast")
                                .code("B000HU7P92")
                                .counts(Counts.builder()
                                        .cases(1)
                                        .suites(0)
                                        .milestones(0)
                                        .runs(Runs.builder()
                                                .total(0)
                                                .active(0)
                                                .build())
                                        .defects(Defects.builder()
                                                .total(0)
                                                .open(0)
                                                .build())
                                        .build())
                                .build()
                )
                .build();
        assertEquals(actual, expected);
        assertEquals(actual.isStatus(), expected.isStatus());
    }

}
