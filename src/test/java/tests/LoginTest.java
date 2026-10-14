package tests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest {

    @Test
    public void verifySuccessLogin(){
        try (Playwright playwright = Playwright.create()){

            Browser browser = playwright.chromium()
                    .launch(new BrowserType.LaunchOptions()
                            .setHeadless(false));

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("https://www.saucedemo.com/");

            //Locate field and enter credentials
            page.getByPlaceholder("Username")
                    .fill("standard_user");

            page.getByPlaceholder("Password")
                    .fill("secret_sauce");


            //identifies the Login button by its accessible role and name.
            page.getByRole(
                    AriaRole.BUTTON,
                    new Page.GetByRoleOptions().setName("Login")
            ).click();


            //Verify successful login and verifies navigation to the inventory page.
            assertThat(page).hasURL(
                    Pattern.compile(".*inventory.html")
            );

            //verifies that the Products heading appears
            assertThat(
                    page.getByText(
                            "Products",
                            new Page.GetByTextOptions().setExact(true)
                    )
            );

            browser.close();
        }
    }
}