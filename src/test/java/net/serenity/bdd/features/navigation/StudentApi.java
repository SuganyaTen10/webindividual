package net.serenity.bdd.features.navigation;

import net.serenity.bdd.steps.StudentApiSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentApi {

    @Steps
    StudentApiSteps steps;

    @Title("Get Student API")
    @Test
    public void getStudentApi() {
        //Given
        steps.getStudentApi();

        // WHEN
        steps.checkStatusCode();

        //Then
        steps.getStudentDetails();
    }

    @Title("Post Student API")
    @Test
    public void addNewStudent() {
        //Given
        steps.newStudentDetail();

        // WHEN
        steps.postNewStudent();

        //Then
        steps.checkNewStudent();
    }



}

