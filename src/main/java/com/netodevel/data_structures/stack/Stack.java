package com.netodevel.data_structures.stack;

public class Stack<E> {

    private static final int DEFAUL_CAPACITY = 10;

    private int size;
    private Object[] elements;

    public Stack() {
        elements = new Object[DEFAUL_CAPACITY];
    }

    public E push(E string) {
        elements[this.size] = string;
        this.size++;
        return string;
    }

    public E pop() {
        Object element = elements[this.size - 1];
        elements[this.size] = null;
        size--;
        return (E) element;
    }

    public int size() {
        return this.size;
    }
}
