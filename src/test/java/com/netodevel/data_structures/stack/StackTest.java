package com.netodevel.data_structures.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackTest {

    Stack<String> stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack<>();
    }

    @Test
    @DisplayName("should push a element in stack")
    public void push() {
        stack.push("String");
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    @DisplayName("should return a element when pushed")
    public void shouldReturnElement() {
        var elementValue = stack.push("String");
        Assertions.assertEquals("String", elementValue);
    }

    @Test
    @DisplayName("should return a element when pop")
    public void shouldReturnElementWhenPop() {
        stack.push("String");
        var elementValue = stack.pop();

        Assertions.assertEquals("String", elementValue);
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    @DisplayName("should return a element when pop")
    public void shouldReturnElementWhenManyValuesInserted() {
        stack.push("String");
        stack.push("String");
        stack.push("String");
        stack.push("other");

        var elementValue = stack.pop();
        Assertions.assertEquals("other", elementValue);
        Assertions.assertEquals(3, stack.size());
    }

}