package com.netodevel.algorithm.pattern_search;

/**
 * Input:  txt[] = "THIS IS A TEST TEXT"
 * pat[] = "TEST"
 * Output: Pattern found at index 10
 * <p>
 * Input:  txt[] =  "AABAACAADAABAABA"
 * pat[] =  "AABA"
 * Output: Pattern found at index 0
 * Pattern found at index 9
 * Pattern found at index 12
 */
public class NaivePatternSearch {

    public boolean matchPattern(String input, String text) {
        char[] inputChar = input.toCharArray();
        char[] textChar = text.toCharArray();

        int totalCharMatch = 0;

        for (int i = 0; i < textChar.length; i++) {
            for (int j = 0; j < inputChar.length; j++) {
                if (i + 1 > textChar.length - 1) break;
                if (inputChar[j] != textChar[i + 1]) {
                    break;
                }
                if (totalCharMatch == textChar.length) {
                }
                totalCharMatch++;
            }
        }

        return totalCharMatch == textChar.length;
    }
}
