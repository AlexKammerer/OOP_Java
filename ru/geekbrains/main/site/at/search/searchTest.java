package ru.geekbrains.main.site.at.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchTest extends base {

    @Test
    void check() {
        WebElement buttonSearch = driver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");


        WebElement professions = driver.findElement(By.xpath("//div[@class='search-overlay']//li[2]//a[1]//span[1]"));
        Assertions.assertTrue (Integer.parseInt(professions.getText()) > 2);

        WebElement courses = driver.findElement(By.xpath("//div[@class='search-overlay']//li[3]/a[1]/span[1]"));
        Assertions.assertTrue (Integer.parseInt(courses.getText()) > 15);

        WebElement events = driver.findElement(By.xpath("//div[@class='search-overlay']//li[4]/a[1]/span[1]"));
        Assertions.assertTrue (Integer.parseInt(events.getText()) > 180);
        Assertions.assertTrue (Integer.parseInt(events.getText()) < 300);
        driver.findElement(By.xpath("//div[@class='text-left v-padder']/a[normalize-space(text())='Java Junior. Что нужно знать для успешного собеседования?']"));

        WebElement posts = driver.findElement(By.xpath("//div[@class='search-overlay']//li[5]/a[1]/span[1]"));
        Assertions.assertTrue (Integer.parseInt(posts.getText()) > 300);

        WebElement topics = driver.findElement(By.xpath("//div[@class='search-overlay']//li[6]/a[1]/span[1]"));
        Assertions.assertNotEquals(350, Integer.parseInt(topics.getText()));

        WebElement tests = driver.findElement(By.xpath("//ul[@class='search-page-tabs']//li[7]//a[1]//span[1]"));
        Assertions.assertNotEquals (0, Integer.parseInt(tests.getText()));

        driver.findElement(By.xpath("//div[@class='company-item']//div[2]/h3[1]/a[normalize-space(text())='Образовательный портал GeekBrains']"));
    }
}
