package com.company;


/**
 * Created by Admin on 27.03.16.
 */
public class CustomArrayList<E> implements MethodsOfCustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 5;
    Object personArr[] = {};
    private int size;

    public CustomArrayList() {
        personArr = new Object[INITIAL_CAPACITY];
    }

    private boolean checkRange(int index) {
        if (index < 0 || index > size) {
            System.out.println("Index is out of range!");
            System.out.println();
        }
        return true;
    }

//    @Override
//    public Object[] createArray() {
//
//        return new Object[INITIAL_CAPACITY];
//    }



    /**
     * method return size of the array
     */
    @Override
    public int sizeArray() {
        System.out.println("Length of array is " + size);
        return size = personArr.length;

    }

    /**
     * method clones the array
     * @return a clone of same array
     */
    @Override
    public Object[] cloneArray() {
        Object[] personArr2 = new Object[personArr.length];
        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = personArr2[i];
        }

        System.out.println("Array was clone \n" +
                "successfully");
        return personArr2;
    }

    /**
     * method check
     */

    @Override
    public void containsElementArray() {

    }

    /**
     * method returns element on specific index.
     */
    @Override
    public E containsElementArray(int index) {
        if (!checkRange(index)) {
            return (E) personArr[index];
        }


    }

    @Override
    public int getIndexElement() {
        return 0;
    }

    @Override
    public void addElement() {

    }


    @Override
    public int getIndexElement(E e) {

        return 0;
    }




    @Override
    public boolean addElement(E e) {

        personArr[size++]=e;

    }

    @Override
    public void clearArray() {

    }

    @Override
    public Object getObject() {
        return null;
    }

    @Override
    public Object removeByIndex() {
        return null;
    }

    @Override
    public boolean removeByObject() {
        return false;
    }

    @Override
    public void displayArray() {

    }
}
