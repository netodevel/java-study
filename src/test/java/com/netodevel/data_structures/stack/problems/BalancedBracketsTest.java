package com.netodevel.data_structures.stack.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BalancedBracketsTest {

    public BalancedBrackets balancedBrackets;

    @BeforeEach
    public void setUp() {
        balancedBrackets = new BalancedBrackets();
    }

    @Test
    public void verifyExpression() {
        var exp = "([{}])";
        boolean valueReturned = balancedBrackets.expIsBalanced(exp);
        Assertions.assertTrue(valueReturned);
    }

    @Test
    public void shouldReturnFalse() {
        var exp = "([{])";
        boolean valueReturned = balancedBrackets.expIsBalanced(exp);
        Assertions.assertFalse(valueReturned);
    }

}