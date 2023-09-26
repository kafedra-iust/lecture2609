package com.example.lecture2609.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named
@SessionScoped
@Data
public class StudentBean implements Serializable {
    private Student student = new Student();
}
