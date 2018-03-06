package net.serenity.bdd.features.navigation;

import net.serenity.bdd.model.Category;
import net.serenity.bdd.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.junit.annotations.TestData;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Collection;


@RunWith(SerenityParameterizedRunner.class)
@WithTag("StudentAdmin")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WhenUserLogIn {
// Testing GIT after Gitignore updates in remote 1
    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"user1@mail.com", "P@ssw0rd"},
                {"user6@gmail.com", "P@ssw0rd"}

        });
    }

    private final String username;
    private final String password;

    public WhenUserLogIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Steps
    NavigatingUser user;

    @Managed(uniqueSession = true)
    WebDriver browser;

    @Title("User finds LogIn link")
    @Test
    public void shouldBeAbleToNavigateToLogIn() {
        //Given
        user.isOnHomePage();

        // WHEN
        user.whenClickLogInLink(Category.Log);

        //Then
        user.shouldSeePageTitleContaining("Log in - Contoso University");
    }

    @Title("User Logging In")
    @Test
        public void userShouldBeAbleToLogIn() {
        //Given
        //user.isOnHomePage();
        //user.whenClickLogInLink(Category.Log);

        // WHEN
        user.entersLoginDetails(username,password);

        //Then
        user.shouldBeLoggedIn();
    }


}
