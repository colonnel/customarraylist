package com.company;

/**
 * Created by Admin on 12.03.16.
 */
public class Persons {
    private String name;
    private int age;
    private String job;
    //public String say ="Hello!";

    Persons() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
