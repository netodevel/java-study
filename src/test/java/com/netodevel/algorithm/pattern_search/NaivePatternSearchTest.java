package com.netodevel.algorithm.pattern_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NaivePatternSearchTest {

    NaivePatternSearch naivePatternSearch;

    @BeforeEach
    public void setUp() {
        naivePatternSearch = new NaivePatternSearch();
    }

    @Test
    public void shouldMatchPattern() {
        var text = "THIS IS A TEST TEXT";
        var input = "TEXT";

        naivePatternSearch.matchPattern(input, text);
    }


}