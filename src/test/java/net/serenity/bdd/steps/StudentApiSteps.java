package net.serenity.bdd.steps;

import net.serenity.bdd.ui.AddStudentService;
import net.thucydides.core.annotations.Step;

public class StudentApiSteps {

    private final AddStudentService addStudentService;
    public StudentApiSteps() {
        addStudentService = new AddStudentService();
    }

    @Step
    public void getStudentApi() {
        addStudentService.getStudent();
    }

    @Step
    public void checkStatusCode() {
    }

    @Step
    public void getStudentDetails() {
        addStudentService.getStatusLog();
    }

    @Step
    public void newStudentDetail() {
        addStudentService.newStudent();
    }

    @Step
    public void postNewStudent() {
        addStudentService.postStudent();
    }

    @Step
    public void checkNewStudent() {
    }

}
