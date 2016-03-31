package com.company;

/**
 * Created by Admin on 12.03.16.
 */
public class Persons {
    private String name="Serg";
    private int age=33;
    private String job="Admin";
    //public String say ="Hello!";

    public Persons(String name, int age, String job) {
        this.name=name;
        this.age=age;
        this.job=job;
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
