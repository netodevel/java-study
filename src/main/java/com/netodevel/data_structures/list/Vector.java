package com.netodevel.data_structures.list;

import java.util.Arrays;
import java.util.Objects;

public class Vector {

    private Object[] elements;
    private int size;

    public Vector(int capacity) {
        this.elements = new Object[capacity];
        this.size = 0;
    }

    /**
     * Algoritimo não eficiente
     *
     * @param element
     */
    @Deprecated
    public void addDeprecated(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.isNull(elements[i])) {
                elements[i] = element;
                break;
            }
        }
    }

    public Object get(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IllegalArgumentException("ops");
        }
        return elements[index];
    }

    public void add(Object element) {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        }
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
