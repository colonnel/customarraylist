package com.company;

/**
 * Created by Admin on 27.03.16.
 */
public interface MethodsOfCustomArrayList<E> {

    int sizeArray();

    CustomArrayList cloneArray();

    boolean containsElementArray(E o);

    Object containsElementArray(int index);

    int getIndexElement(E o);

    void addElement(E o);

    void clearArray();

    Object getObject(int index);

    boolean isEmpty();

    Object removeByIndex(int index);

    boolean removeByObject(E o);

    E[] toArray();

    void displayArray();
}
