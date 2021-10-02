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
    public void add(Object element) {
        for (int i = 0; i < elements.length; i++) {
            if (Objects.isNull(elements[i])) {
                elements[i] = element;
                break;
            }
        }
    }

    public void addMoreFast(Object element) {
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
