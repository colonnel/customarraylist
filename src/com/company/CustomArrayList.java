package com.company;

/**
 * Created by Admin on 12.03.16.
 */
public class CustomArrayList {
    private int size = 6;
    Persons personArr[] = new Persons[size];

    public Persons[] createArray() {

        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = new Persons();
        }
        return personArr;
    }

    //size - кол. элементов в листе
    public int sizeArray() {
        int sizeArray = personArr.length;
        return sizeArray;

    }

    //clone - создает новый лист и записывает в него существующий
    public Persons[] cloneArray() {
        Persons personArr2[] = new Persons[size];
        for (int i = 0; i < personArr2.length; i++) {
            personArr2[i] = personArr[i];
        }
        return personArr2;
    }

    //contains - принимает объект, проверяет его наличие в листе и возвращает boolean
    public boolean containsElementArray()

    {
    }

    //indexof - принимает объект, возвращает его индекс
    public int getIndexElement(Persons) {
        int index = 0;
        for (int i = 0; i < personArr.length; i++) {

            if (Persons == personArr[i]) {
                break;
                index = i;
            }
        }
        return index;

    }

    //add - добавляет объект в лист
    public boolean addElement()

    {
    }

    //clear - очищает лист от объектов
    public boolean clearArray() {

        boolean value = false;
        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = null;
        }
        for (int i = 0; i < personArr.length; i++) {

            if (personArr[i] == null) {
                value = true;
            }
        }
        return value;
    }

    //get - принимает индекс, возвращает объект
    public Persons getObject(int index) {
        return personArr[index];
    }

    //isempty - возвращает boolean, проверяет пустой или нет
    public boolean isEmpty() {
        boolean value = false;
        for (int i = 0; i < personArr.length; i++) {
            if (personArr[i] == null) {
                value = true;
            }
        }
        return value;
    }

    //remove - удаление по индексу
    public boolean removeByIndex(int index) {
        boolean sucsess = false;
        personArr[index] = null;
        if (personArr[index] == null) {
            sucsess = true;
        }
        return sucsess;
    }

    //remove - удаление по объекту
    public boolean removeByObject

    {
    }

    //toarray - возвращает массив объектов
    public boolean toArray

    {
    }


}
