package com.bazaa.fundamentals.basics.operators;

public class Operators {
    // Question 1: What will be the output of this code?
    int x = 5;
    int y = x++;
    int z = ++x;
    // System.out.println(x + " " + y + " " + z);

    /** Initially, x = 5
     y = x++ means "assign the current value of x to y, then increment x"
     So y becomes 5, and x becomes 6
     z = ++x means "increment x first, then assign the new value to z"
     So x becomes 7, and z becomes 7
     Therefore, the output would be 7 5 7 (for x, y, and z respectively)*/

    // Question 2: What is the result of this expression?
    int a = 10;
    int b = 5;
    int c = 20;
    // System.out.println(a > b && a < c);

    /** The result would be true because a is greater than b and a is less than c */


    // Question 3: What will be the value of result after this operation?
    int num = 35;
    // int result = num % 10 + num / 10;

    /** so it will be num % 10 = 5 and then num / 10 = 3. Finally 5 + 3 = 8. Giving the result of 8 */


    // Question 4: What happens when you use the bitwise AND operator (&) on these values?
    // System.out.println(5 & 3);

    /** 5 in binary is 101
     3 in binary is 011
     Comparing each bit: 1&0=0, 0&1=0, 1&1=1
     Result is 001 in binary, which is 1 in decimal
     So the output would be 1 */


    // Question 5: What will be output by this code that uses a ternary operator?
    int num1 = 10;
    int num2 = 20;
    // String result = (num1 > num2) ? "num1 is larger" : "num2 is larger";
    // System.out.println(result);

    /** the expression reads "if num1 > num2 then result = num1 is larger. if not result = num2 is larger"
     * therefore for this case it would print out "num2 is larger"*/

}

