package com.example.lecture2609.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named
@SessionScoped
@Data
public class TabBean implements Serializable {
    Calculator calculator = new Calculator();

    public String tabulate() {
        calculator.tabulate();
        return "tabulation";
    }
}
