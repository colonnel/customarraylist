package com.company;

/**
 * Created by Admin on 27.03.16.
 */
public interface MethodsOfCustomArrayList<E> {

    Object[] createArray();
    int sizeArray();
    Object[] cloneArray();
    void containsElementArray();

    E containsElementArray(int index);

    int getIndexElement();
    void addElement();



    void clearArray();
    Object getObject();
    Object removeByIndex();
    boolean removeByObject();
    void displayArray();
}
