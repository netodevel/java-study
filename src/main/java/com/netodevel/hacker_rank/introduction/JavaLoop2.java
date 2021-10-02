package com.netodevel.hacker_rank.introduction;

import java.util.Scanner;

public class JavaLoop2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        if (t >= 0 && t <= 500) {
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (a >= 0 && a <= 50) {
                    if (b >= 0 && b <= 50) {
                        if (n <= 15) {
                            int aux = a;
                            for (int j = 0; j < n; j++) {
                                a += Math.pow(2, j) * b;
                                System.out.printf("%s ", a);
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
        in.close();
    }
}
