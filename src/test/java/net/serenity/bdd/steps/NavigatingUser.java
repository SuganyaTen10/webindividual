package net.serenity.bdd.steps;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.ui.StudentHomePage;
import net.serenity.bdd.ui.UserLoginPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class NavigatingUser {

    StudentHomePage studentHomePage;
    UserLoginPage userLoginPage;


    @Step
    public void isOnHomePage() {
        studentHomePage.open();
    }

    @Step
    public void whenClickLogInLink(Category category) {
        studentHomePage.selectCategory(category);
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {

        assertThat(userLoginPage.getTitle().contains(expectedTitle));
    }

    @Step
    public void entersLoginDetails(String username, String password) {

        userLoginPage.loginDetails(username, password);
    }

    @Step
    public void shouldBeLoggedIn() {
        studentHomePage.logoffLink();

    }
}


