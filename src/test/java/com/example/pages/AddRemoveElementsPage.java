package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {
    private WebDriver driver;

    private By addElementButton = By.xpath("//button[text()='Add Element']");
    private By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void clickAddElement() {
        driver.findElement(addElementButton).click();
    }

    public void clickDelete() {
        driver.findElement(deleteButton).click();
    }

    public boolean isDeleteButtonVisible() {
        return !driver.findElements(deleteButton).isEmpty();
    }
}
