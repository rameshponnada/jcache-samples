package com.rameshp.jcache.hazelcast.samples.domain;

import java.io.Serializable;

/**
 * Created by Ramesh Ponnada on 5/20/15.
 */
public class Employee implements Serializable{


    String firstName;
    String lastName;
    String emailAddress;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailAddress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
