
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DragAndDropTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

            WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
            );

            wait.until(d -> d.findElement(By.id("draggable")).isDisplayed());

            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
            actions.dragAndDrop(source, target).perform();

            String result = target.getText();
            System.out.println("Drop result: " + result);

            if (result.equals("Dropped!")) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED");
            }
        } finally {
            driver.quit();
        }
    }
}
