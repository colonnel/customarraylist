package com.company;

import java.util.Arrays;

/**
 * Created by Admin on 12.03.16.
 */
public class CustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 5;
    Persons personArr[] = {};
    private int size;


    public CustomArrayList() {
        personArr = new Persons[INITIAL_CAPACITY];
    }

    //  public Persons[] createArray() {}

    //size - кол. элементов в листе
    public int sizeArray() {
        size = personArr.length;
        return size;

    }

    //clone - создает новый лист и записывает в него существующий
    public Persons[] cloneArray() {
        Persons personArr2[] = new Persons[personArr.length];
        for (int i = 0; i < personArr2.length; i++) {
            personArr2[i] = personArr[i];
        }
        return personArr2;
    }

    //contains - принимает объект, проверяет его наличие в листе
    public void containsElementArray(Persons p) {
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i] == p) {
                break;
            }
        }

    }

    //indexof - принимает объект, возвращает его индекс
    public int getIndexElement(Persons p) {

        int index;
        for (index = 0; index < personArr.length; index++) {

            if (personArr[index] == p) {
                break;
            }


        }
        return index;
    }

    //add - добавляет объект в лист
    public void addElement(int index, Persons p) {
        System.arraycopy(personArr, index, personArr, index + 1,
                size - index);
        personArr[index] = p;
        size++;
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = personArr.length * 2;
        personArr = Arrays.copyOf(personArr, newIncreasedCapacity);
    }

    //clear - очищает лист от объектов
    public void clearArray() {

        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = null;
        }
        size = 0;
    }

    //get - принимает индекс, возвращает объект
    public Persons getObject(int index) {
        return personArr[index];
    }

    //isempty - возвращает boolean, проверяет пустой или нет
    public boolean isEmpty() {

        return size==0;
    }

    //remove - удаление по индексу
    public Persons removeByIndex(int index) {
        Persons removedPerson = personArr[index];
        for (int i = index; i < size; i++) {
            personArr[i] = personArr[i + 1];
        }
        size--;
        return removedPerson;
    }

    //remove - удаление по объекту
    public void removeByObject(Persons p)    {
        for (int i = 0; i <personArr.length ; i++) {
            if (p==personArr[i]){
                personArr[i]=personArr[i+1];
            }
        }
        size--;
        }
    // TODO: 26.03.16 make return boolean 

    //toarray - возвращает массив объектов
    public void toArray() {
        System.out.println("Display array:");
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i] + " ");
        }
    }


}
