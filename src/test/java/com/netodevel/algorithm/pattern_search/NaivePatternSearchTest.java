package com.netodevel.algorithm.pattern_search;

import com.jerolba.jmnemohistosyne.Histogramer;
import com.jerolba.jmnemohistosyne.MemoryHistogram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NaivePatternSearchTest {

    NaivePatternSearch naivePatternSearch;

    @BeforeEach
    public void setUp() {
        naivePatternSearch = new NaivePatternSearch();
    }

    @Test
    public void shouldMatchPattern() {
        var text = "this is a test text";
        var input = "text";

        boolean result = naivePatternSearch.matchPattern(input, text);
        assertTrue(result);
    }

    @Test
    public void shouldNotMatchPattern() {
        var text = "THIS IS A TEST TEXT";
        var input = "EXP";
        boolean result = naivePatternSearch.matchPattern(input, text);

        assertFalse(result);
    }

    @Test
    public void shouldMatch() {
        var text = "this is a test text";
        var input = "text";

        boolean result = naivePatternSearch.lessMemoryMatchPattern(input, text);
        Assertions.assertTrue(result);
    }

    @Test
    public void notMatch() {
        var text = "this is a test text";
        var input = "exp";

        boolean result = naivePatternSearch.lessMemoryMatchPattern(input, text);
        Assertions.assertFalse(result);
    }

    //TODO: how to measure memory and performance a method java?
    @Test
    public void verifySizeObject() {
        var a = "THIS IS A TEST TEXT";
        var b = "EXP";

        MemoryHistogram diff = Histogramer.getDiff(() -> naivePatternSearch.matchPattern(a, b));
        System.out.println(diff.get(naivePatternSearch.getClass().getName()).getInstances());
        System.out.println(diff.get(naivePatternSearch.getClass().getName()).getSize());
    }

}