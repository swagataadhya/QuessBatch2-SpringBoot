package com.Prograd.HelloWorldDemo;

public class Employee {
    private String name;
    private int age;
    private String designation;
    public Employee(String n, int a, String designation)
    {
        this.name=n;
        this.age=a;
        this.designation=designation;
    }



    public String getName()
    {
        return this.name;
    }

    public int getAge() {
        return age;
    }
    public String getDesignation(){
        return designation;
    }
}
