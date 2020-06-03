package ru.geekbrains.main.site.at.navigations;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class events extends base {

    @Test
    void check() {
        WebElement buttonCourses = driver.findElement(By.cssSelector("[id='nav'] [href='/events']"));
        buttonCourses.click();
        Boolean displayHeader = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).isDisplayed();
        System.out.println(displayHeader);
        Boolean displayFooter = driver.findElement(By.cssSelector("div[class=\"site-footer__content\"]")).isDisplayed();
        System.out.println(displayFooter);
    }
}
