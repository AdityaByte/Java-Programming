package com.java.multithreading.lambdaexpression;

// Here this is the Functional interface.
@FunctionalInterface
interface Student {
    public String getInfo(String name);
}

// For using this method we have to create out an implementation class.
class EngineeringStudent implements Student {
    @Override
    public String getInfo(String name) {
        return name + " is engineering student";
    }
}

public class NormalExample {
    public static void main(String[] args) {
        Student student = new EngineeringStudent();
        System.out.println(student.getInfo("aditya"));

        // Another way of creating the implementation of the interface.

        Student lawStudent = new Student() {
            @Override
            public String getInfo(String name) {
                return name + " is a law student";
            }
        };

        System.out.println(lawStudent.getInfo("abhinav"));

        // Since it is functional interface having only one method so we can use lambda expression.
        Student medicalStudent = (String name) -> {
            return name + " is medical student"; 
        };

        System.out.println(medicalStudent.getInfo("yeshank"));

        // If we have only one paper we dont need to specify the return type and even the paranthesis too and 
        // only one statement is written in body we don't need to write the braces and if we are returning don't need to 
        // write the return keyword.

        Student commerceStudent = name -> name + " is commerce student";
        System.out.println(commerceStudent.getInfo("kabir"));
    }
}
