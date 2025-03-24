package com.bazaa.fundamentals.basics.datatypes;

public class DataTypes {
    // Question 1: What will be the output of this code?
    byte b1 = 127;
    byte b2 = 1;
    // byte sum = b1 + b2;
    // System.out.println(sum);
    /** this will error because the number would be too big for byte **/

    // Question 2: Which of these literals creates a float value?
    // a) 45.6
    // b) 45.6f
    // c) 45.6d
    // d) 45

    /** b would create a float value because it has f at the end of the number as required **/

    // Question 3: What is the range of the short data type in Java?

    /** bigger than byte but smaller than long the specific range is -32,768 to 32,767 (16-bit signed integer) **/

    // Question 4: What will happen in this code?
    // char letter = "A";

    // Question 5: What will be the output of this code?
    int num = 7;
    double result = num / 2;
    // System.out.println(result);

    /** the answer would be 3.0 because it is stored in a double variable **/

    // Question 6: What is the difference between primitive and reference data types?

    /** primitive can't be reduced and holds no functions. Reference is a data type created from a primitive data type that
     * has methods and other tools to manipulate the primitive data type that is named after.
      */

    /** as well Reference types store addresses (references) to objects in memory,
     *   while primitives store the actual value.
     */

    // Question 7: Why would this code cause a compilation error?
    // long bigValue = 3000000000;

   /** yes because the bigValue number doesn't have an l at the end of the number to define a long **/

    // Question 8: What will be stored in result after this operation?
    int i = 257;
    byte b = (byte)i;

    // System.out.println(b);

    /** When 257 is cast to a byte, it doesn't become 127.
     * Instead, it "wraps around" because a byte can only represent 256 different values.
     * The result would be 1 (257 - 256 = 1). So 1 would be stored **/

    // Question 9: What is the default value for a boolean variable in a class?
    /** default value is false for a boolean variable **/

    // Question 10: What will be printed by this code?
    // System.out.println('a' + 'b');
    /** It won't print "ab". In Java, when you add char values,
     * they're promoted to int and their ASCII/Unicode values are added.
     * 'a' has the value 97 and 'b' has the value 98, so the result would be 195.
     * because "a" is a string and 'a' is a character**/
}
