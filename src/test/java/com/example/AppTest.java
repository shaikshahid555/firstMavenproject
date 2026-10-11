
package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testWebsiteTitle() {

        ChromeOptions options = new ChromeOptions();

        // Run browser without displaying a window
        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        try {
            // Open a practice webpage
            driver.get(
                "https://www.selenium.dev/selenium/web/web-form.html"
            );

            // Get the webpage title
            String title = driver.getTitle();

            System.out.println("Website title: " + title);

            // Verify the title
            assertTrue(title.contains("Web form"));

            System.out.println("Selenium test passed!");

        } finally {
            driver.quit();
        }
    }
}
