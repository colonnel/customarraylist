package com.company;


import java.util.Arrays;

/**
 * Created by Admin on 27.03.16.
 */
public class CustomArrayList<E> implements MethodsOfCustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 5;
    Object personArr[] = {};
    private int size;

    /**
     * Constructor
     */
    public CustomArrayList() {
        personArr = new Object[INITIAL_CAPACITY];
    }

    /**
     * Method
     *
     * @return size of array
     */
    @Override
    public int sizeArray() {
        int size = personArr.length;
        System.out.println("Size");
        return size;
    }

    /**
     * Method clones array
     *
     * @return new array
     */
    @Override
    public CustomArrayList cloneArray() {
        CustomArrayList<E> customList = new CustomArrayList<E>();
        Object copyList[] = new Object[size];
        for (int i = 0; i < size; i++) {
            copyList[i] = personArr[i];
            customList.addElement((E) copyList[i]);
        }
        return customList;

    }

    /**
     * Method checks containes the presence of the object in array
     *
     * @param o
     * @return boolean
     */
    @Override
    public boolean containsElementArray(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(personArr[i])) {
                System.out.println("Object" + personArr[i] + "was found");
                return true;
            }
        }
        System.out.println("Object was not found");
        return false;
    }


    /**
     * Method checks containes the presence of the object in array
     *
     * @param index
     * @return object
     */
    @Override
    public E containsElementArray(int index) {
        if (index >= 0 && index < size) {
            System.out.print("The object with index" + " " + index + ":" + " ");
            return (E) personArr[index];
        }
        System.out.println("The object with index" + " " + index + " " + "was not found");
        return null;

    }

    /**
     * Method gets index of object in array
     *
     * @param o
     * @return index
     */
    @Override
    public int getIndexElement(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(personArr[i])) {
                System.out.println("Index of the" + o + "is: " + i);
                return i;
            }
        }
        System.out.println("Object was not found!");
        return -1;
    }


    /**
     * Method ads object to array
     *
     * @param o
     */
    @Override
    public void addElement(E o) {
        if (size == personArr.length) {
            sizeDoubling();
        }
        personArr[size++] = o;

    }

    private void sizeDoubling() {
        int newIncreasedSize = personArr.length * 2;
        personArr = Arrays.copyOf(personArr, newIncreasedSize);
    }

    /**
     * Method clears array
     */
    @Override
    public void clearArray() {
        size = 0;
        personArr = new Object[size];
    }

    /**
     * Method gets the object of array
     *
     * @param index
     * @return object
     */
    @Override
    public E getObject(int index) {
        if (index >= 0 && index < size) {
            System.out.print("The object with index" + " " + index + ":" + " ");
            return (E) personArr[index];
        }
        System.out.println("The object with index" + " " + index + " " + "was not found");
        return null;
    }

    /**
     * Method checks the array is empty or not
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Method removes object from array
     *
     * @param index
     * @return object
     */
    @Override
    public Object removeByIndex(int index) {

        if (index >= 0 && index < size) {
            Object delObject = personArr[index];
            for (int i = index; i < size; i++) {
                personArr[i] = personArr[i + 1];
            }
            size--;
            System.out.println("Object" + delObject + "was removed");
            return delObject;
        }
        System.out.println("Incorrect index");
        return false;

    }

    /**
     * Method removes object from array
     *
     * @param o
     * @return boolean
     */
    @Override
    public boolean removeByObject(E o) {
        for (int i = 0; i <size ; i++) {
            if (o.equals(personArr[i])) {
                int index = i;
                for (int j = index; j < size; j++) {
                    personArr[j] = personArr[j + 1];
                }
                System.out.println("Object:" +o+"was removed");
                size--;
                return true;
            }
        }
        System.out.println("Object was not found!");
        return false;
    }

    /**
     * Method
     *
     * @return array
     */
    @Override
    public E[] toArray() {
        Object arr[] = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = personArr[i];
        }
        return (E[]) arr;
    }

    /**
     * Method displays array in console
     */
    @Override
    public void displayArray() {
        System.out.print("Display list : ");
        if (size == 0) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(personArr[i] + " ");
            }
            System.out.println();
        }

    }




}

