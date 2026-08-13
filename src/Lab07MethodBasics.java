/*
 * COSC 1173 Programming Lab - Lab 07: Method Basics
 * Textbook reference: Liang, Chapter 6 (Methods)
 *
 * Student name: [TYPE YOUR NAME HERE]
 * Date:         [TYPE TODAY'S DATE HERE]
 *
 * DO NOT change any method name, parameter list, or return type. The automated
 * test driver calls these methods by their exact signatures.
 *
 * REQUIREMENT: every executable statement you write must carry a line comment.
 */
public class Lab07MethodBasics {

    /**
     * STEP 1 - Converts a Celsius temperature to Fahrenheit.
     * Formula: fahrenheit = (9.0 / 5) * celsius + 32
     * TODO: replace the placeholder return with the correct expression.
     * Watch out: 9 / 5 in integer arithmetic is 1, which is wrong.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return 0.0; // placeholder so the file compiles before you start
    }

    /**
     * STEP 2 - Reports whether a number is even.
     * TODO: return the result of a remainder test. Do not use an if statement:
     * a boolean expression already evaluates to true or false.
     */
    public static boolean isEven(int number) {
        return false; // placeholder
    }

    /**
     * STEP 3 - Returns the largest of three integers.
     * TODO: you may use Math.max twice, or a chain of if statements.
     */
    public static int max3(int a, int b, int c) {
        return 0; // placeholder
    }

    /**
     * STEP 4 - Returns n factorial (n! = 1 * 2 * ... * n).
     * By definition 0! is 1. Return -1 when n is negative, since factorial is undefined there.
     * TODO: use a loop and a long accumulator. long is required because 20! exceeds int range.
     */
    public static long factorial(int n) {
        return 0L; // placeholder
    }

    /**
     * STEP 5 - Returns the body mass index: weight in kilograms divided by the square
     * of the height in meters. Return -1.0 when height is zero or negative, because
     * dividing by zero would produce Infinity rather than a usable answer.
     */
    public static double bmi(double weightKg, double heightM) {
        return 0.0; // placeholder
    }

    /**
     * STEP 6 - Returns the total cost of an order after tax.
     * subtotal * (1 + taxRate), where taxRate is a fraction such as 0.0825.
     */
    public static double totalWithTax(double subtotal, double taxRate) {
        return 0.0; // placeholder
    }

    /**
     * STEP 7 - Demonstrate your methods. This method is not graded by the test driver,
     * but an empty main will cost style points. Call each method at least once and
     * print the result with a descriptive label.
     */
    public static void main(String[] args) {
        System.out.println("100 C in Fahrenheit: " + celsiusToFahrenheit(100)); // example call
        // TODO: add one printed demonstration for each remaining method.
    }
}
