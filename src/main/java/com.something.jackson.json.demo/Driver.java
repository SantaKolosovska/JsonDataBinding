package com.something.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();
            // read JSON file and map to java POJO:
            // data/sample-lite.json

            Student student = mapper.readValue(
                    new File("data/sample-full.json"), Student.class);

            // the unknown fields in json are handled in student class
            // print first name and last name
            System.out.println("First name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());

            // print out address: street and city
            Address address = student.getAddress();

            System.out.println("Street: " + address.getStreet() + " City: " + address.getCity());

            // print out languages
            for (String language : student.getLanguages()) {
                System.out.println(language);
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
