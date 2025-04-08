package com.bazaa.hackerrank.day2;

import java.util.Scanner;

public class javaLoops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int current = a;
            for (int j = 0; j < n; j++) {
                current += (int)Math.pow(2, j) * b;
                System.out.print(current + (j < n-1 ? " " : ""));
            }
            System.out.println();
        }
        in.close();
    }
}
