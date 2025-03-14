package main.java.com.bazaa.fundamentals.basics.variables;

public class Variables {
    // Collection of examples and usages

    public static class VariableExamples {
        // Instance variable - belongs to the class instance
        String customerName = "John Doe";

        // Static/class variable - shared across all instances
        static int customerCount = 0;

        public void calculateTotal() {
            // Local variables - only available within this method
            double price = 29.99;
            int quantity = 5;

            // Using variables in expressions
            double subTotal = price * quantity;

            // Constants
            final double TAX_RATE = 0.08;

            // More calculations
            double tax = subTotal * TAX_RATE;
            double total = subTotal + tax;

            System.out.println("Customer: " + customerName);
            System.out.println("Subtotal: $" + subTotal);
            System.out.println("Tax: $" + tax);
            System.out.println("Total: $" + total);
        }

        public void temperatureConverter() {
            // Type conversion example
            int fahrenheit = 98;

            // Formula: (F - 32) * 5/9 = C
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;

            // Type casting example
            int celsiusRounded = (int) celsius;

            System.out.println(fahrenheit + "°F = " + celsius + "°C");
            System.out.println("Rounded: " + celsiusRounded + "°C");
        }

        public void studentGrades() {
            // Array variables
            int[] scores = {95, 88, 76, 92, 85};
            char[] grades = {'A', 'B', 'C', 'A', 'B'};

            // Boolean variables
            boolean isPassing = true;

            // String operations
            String studentName = "Alice";
            String course = "Java Programming";
            String studentInfo = studentName + " - " + course;

            System.out.println(studentInfo);
        }
    }

    // Collection of test questions

    public static class VariableQuiz {

    // What will be the value of result after this code executes?

        int a = 10;
        int b = 3;
        double result = (double) a / b;

      /** the value of the result will be a decimal value. It was casted to be a double which contains decimals **/

    // What is wrong with the following code?

        // float price = 19.99;//


      /** the float can't hold the value because is missing a "F" to designate the number as a float **/
       float price = 19.99F;


    // Which of the following is a valid variable name in Java?

        //a) 1stName
        /** this is not a valid variable name because java doesn't allow variables to start with numbers **/
        //b) student-id
        /** this is not a valid variable name because java doesn't allow for hypens in variable names **/
        //c) _count
        /** this is a valid java variable name **/
        //d) class
        /** this is not a valid variable name because "class" is already taken by java **/

        // What will be printed by this code?
        int x = 5;
        {
            int x = 10;
            System.out.println(x);
        }
         System.out.println(x);


    // What is the difference between int and Integer in Java?

        /** int is a primitive value. and integer is a class that wraps the int value and contains methods that help transform or change the int value **/

    // What happens in this code?

        //long bigNumber = 2147483648;

        /** the long is not ended with "L" so java is treating it as an integer number. **/

        long bigNumber = 2147483648L;


    // What is the output of this code?
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);


        /** the output would be "true" this is because characters are defined as Unicode and "65" represents "A" so java sees it as the same value **/

    // What would be stored in smallNum after this conversion?
        double largeNum = 123.456;
        byte smallNum = (byte) largeNum;

        /** The double is casted into a byte so it would lose its decimal part and rounded. In this case it would be rounded to just be "123" **/


    }



}
