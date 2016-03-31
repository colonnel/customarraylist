package com.company;

public class Main {


    public static void main(String[] args) {

        // initialize persons
        Persons person1 = new Persons("Alex", 21, "worker");
        Persons person2 = new Persons("Bob", 23, "admin");
        Persons person3 = new Persons("Sol", 25, "seller");
        Persons person4 = new Persons("Greg", 27, "security");
        Persons person5 = new Persons("Bob", 30, "director");

        //Create object of CustomList class
        CustomArrayList<Persons> myList = new CustomArrayList<>();
        //
        myList.addElement(person1);
        myList.addElement(person2);
        myList.addElement(person3);
        myList.addElement(person4);
        myList.addElement(person5);

        //1. Checking size
        System.out.println("=====Check size of array=====");
        System.out.println(myList.sizeArray());
        System.out.println();

        //2.0Display list
        System.out.println("=====Display elements of array=====");
        myList.displayArray();
        System.out.println();

        //3. Get element
        System.out.println("=====Get element by index=====");
        System.out.println("Incorrect value:");
        System.out.println(myList.getObject(8));
        System.out.println("Correct value:");
        System.out.println(myList.getObject(3));
        System.out.println();

        //4. Get index
        System.out.println("=====Get index by element=====");

        System.out.println(myList.getIndexElement(person3));
        System.out.println();

        // 5. Is empty
        System.out.println("=====Check is the array empty=====");
        System.out.println(myList.isEmpty());
        System.out.println();

        //6. Remove by index
        System.out.println("=====Remove element by index=====");
        System.out.println("Incorrect value:");
        System.out.println(myList.removeByIndex(7));
//        System.out.println("Correct value:");
//        System.out.println(myList.removeByIndex(2));
        System.out.println();

        //7. Remove by object
        System.out.println("=====Remove element=====");
        System.out.println("Correct value:");
        System.out.println(myList.removeByObject(person4));
        System.out.println();


    }

    public static Persons personConstructor(String name, int age, String job) {
        Persons person = new Persons(name, age, job);
        return person;
    }
}
