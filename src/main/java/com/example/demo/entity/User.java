package com.example.demo.entity;

import org.springframework.stereotype.Component;

import java.sql.Struct;

/**
 * Component Class
 */
@Component
public class User {

    /**
     * Variables
     */
    private String firstName;
    private String lastName;

    /**
     * Getter And Setter Methods
     *
     * @return -Set Values
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
