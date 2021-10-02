package com.netodevel.hacker_rank.strings;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var a = scanner.next();
        var b = scanner.next();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.printf("%s %s", capitalize(a), capitalize(b));
    }

    public static String capitalize(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
