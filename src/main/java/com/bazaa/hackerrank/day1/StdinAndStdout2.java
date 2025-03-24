package com.bazaa.hackerrank.day1;

import java.util.Scanner;

public class StdinAndStdout2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numb1 = sc.nextLine();
        String numb2 = sc.nextLine();
        String string1 = sc.nextLine();
        double doubleNumb2 = Double.parseDouble(numb2);
        sc.close();

        System.out.println("String: " + string1 + "\n" + "Double: " + doubleNumb2 + "\n" + "Int: " + numb1);
    }
}
