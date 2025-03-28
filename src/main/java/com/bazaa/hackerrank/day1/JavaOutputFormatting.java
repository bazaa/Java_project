package com.bazaa.hackerrank.day1;

import java.util.Scanner;

/** while this solution gives the right answer it doesn't use printf **/
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.print(s1);
            for (int y=0; y <16 -s1.length(); y++) {
                System.out.print(" ");
            }
            if (x < 10 ) {
                System.out.print("00"+x);
            } else if (x < 100) {
                System.out.print("0"+x);
            }
            else {
                System.out.print(x);
            }
            System.out.print("\n");

        }
        System.out.println("================================");
    }
}

/** here is how the program wansts it **/
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d\n", s1, x);
//        }
//        System.out.println("================================");
//    }
//}




