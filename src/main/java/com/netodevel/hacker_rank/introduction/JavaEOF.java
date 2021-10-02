package com.netodevel.hacker_rank.introduction;

import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var numberLine = 0;
        while (scanner.hasNext()) {
            numberLine = numberLine + 1;
            System.out.printf("%d %s %n", numberLine, scanner.nextLine());
        }
    }
}
