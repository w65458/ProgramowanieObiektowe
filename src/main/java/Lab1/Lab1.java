package Lab1;

import java.util.Random;
import java.util.Scanner;

public class Lab1 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());

        calculateTwoNumbers(scanner.nextDouble(), scanner.nextDouble());

        System.out.println(checkIfPrime(5));

        System.out.println(checkIfDividableBy3And5(15));

        System.out.println(getThirdPower(5));
        
        System.out.println(getSquareRoot(25));

        int leftBorder = scanner.nextInt();
        int rightBorder = scanner.nextInt();
        validateInput(leftBorder, rightBorder);
        int a = random.nextInt(rightBorder - leftBorder + 1) + leftBorder;
        int b = random.nextInt(rightBorder - leftBorder + 1) + leftBorder;
        int c = random.nextInt(rightBorder - leftBorder + 1) + leftBorder;
        System.out.println(checkRightTriangle(a, b, c));
    }

    static String getName(){
        return "Michal";
    }

    static int getAge(){
        return 30;
    }

    static void calculateTwoNumbers(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    static boolean checkIfPrime(int a) {
        return a % 2 == 0;
    }

    static boolean checkIfDividableBy3And5(int a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    static double getThirdPower(double a) {
        return Math.pow(a, 3.0);
    }
    
    static double getSquareRoot(double a) {
        return Math.sqrt(a);
    }

    static void validateInput(int leftBorder, int rightBorder){
        if (rightBorder <= leftBorder)
            throw new AssertionError("Left border of range lower than right border!");
    }

    static boolean checkRightTriangle(double a, double b, double c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2);
    }
    
}
