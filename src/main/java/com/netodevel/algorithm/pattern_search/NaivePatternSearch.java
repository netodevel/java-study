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
        boolean founded = false;

        for (int i = 0; i < textChar.length; i++) {
            for (int j = 0; j < inputChar.length; j++) {
                if (inputChar[j] != textChar[j + i]) {
                    break;
                }
                if (j == (inputChar.length - 1)) {
                    founded = true;
                    System.out.println("pattern found at index: " + i);
                    break;
                }
            }
            if (founded) {
                break;
            }
        }
        return founded;
    }
}
