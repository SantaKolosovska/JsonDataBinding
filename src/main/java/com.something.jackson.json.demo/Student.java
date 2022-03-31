package com.something.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// ignores the fields in json if they are not added as fields here, otherwise the app doesn't run because of the extra
// field in json. We don't always want to ignore it, other times we might handle this problem in other ways
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

    private Address address;

    private String[] languages;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
