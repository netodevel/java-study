package com.netodevel.data_structures.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VectorTest {

    Vector vector;

    @BeforeEach
    void setUp() {
        vector = new Vector(10);
    }

    @Test
    @DisplayName("should add new element on vector")
    void add() {
        vector.add("new element");
        Assertions.assertEquals(1, vector.size());
    }

    @Test
    @DisplayName("should return a element")
    void get() {
        vector.add("new element");
        var value = vector.get(0);
        Assertions.assertEquals("new element", value);
    }

    @Test
    @DisplayName("should return total of elements")
    void size() {
        vector.add("new element");
        vector.add("other element");
        vector.add("and other element");
        Assertions.assertEquals(3, vector.size());
    }

}