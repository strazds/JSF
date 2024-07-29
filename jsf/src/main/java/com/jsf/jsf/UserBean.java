package com.jsf.jsf;

import javax.inject.Named;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
@Entity
public class UserBean {

    private String firstName;
    private String lastName;
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    // Getter und Setter für firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter und Setter für lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter und Setter für age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Ein Beispielmethoden
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
