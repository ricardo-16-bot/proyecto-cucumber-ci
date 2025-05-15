package com.example.steps;

import io.cucumber.java.en.Given;

public class DemoSteps {
    @Given("I print hello")
    public void i_print_hello() {
        System.out.println("Hola desde el step definition!");
    }
}
