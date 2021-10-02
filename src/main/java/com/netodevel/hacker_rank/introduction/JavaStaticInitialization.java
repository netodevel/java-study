package com.netodevel.hacker_rank.introduction;

import java.util.Scanner;

public class JavaStaticInitialization {

    static boolean flag = false;
    static Scanner scanner = new Scanner(System.in);
    static Integer B = scanner.nextInt();
    static Integer H = scanner.nextInt();

    static {

        if (H > 0 && B > 0) {
            if (H <= 100 && B <= 100) {
                flag = true;
            }
        }

        if (Boolean.FALSE.equals(flag)) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
