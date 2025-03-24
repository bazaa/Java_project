package com.bazaa.hackerrank.day1;

import java.util.Scanner;

public class StdinAndStdout1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n");
    }
}
