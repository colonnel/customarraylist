package com.company;

/**
 * Created by Admin on 12.03.16.
 */
public class CustomArrayList {
    int size = 6;
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
    public void cloneArray() {

    }
//contains - принимает объект, проверяет его наличие в листе и возвращает boolean
    public boolean containsElementArray

    {
    }
//indexof - принимает объект, возвращает его индекс
    public int getIndexElement

    {
    }
//add - добавляет объект в лист
    public boolean addElement

    {
    }
//clear - очищает лист от объектов
    public boolean clearArray() {
        for (int i = 0; i < personArr.length; i++) {
            personArr[i] = null;
        }
        for (int i = 0; i < personArr.length; i++) {

            if (personArr[i] == null) {
                return true;
            } else {
                return false;
            }
        }

    }
//get - принимает индекс, возвращает объект
    public Persons getObject

    {
    }
//isempty - возвращает boolean, проверяет пустой или нет
    public boolean isEmpty

    {
    }
//remove - удаление по индексу
    public boolean removeByIndex

    {
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
