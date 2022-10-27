package Lab1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab3 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        studentsAverage();

        countPositiveAndNegativeNumbers();

        countSumOfEvenNumbers();

        countSumOfNEvenNumbers();

        isPalindrome();
    }

    static void studentsAverage() {
        System.out.println("Podaj liczbę studentów:");
        int numberOfStudents = scanner.nextInt();
        int[] points = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            points[i] = rand.nextInt(100) + 1;
            System.out.println("Punkty studenta nr. " + (i + 1) + ": " + points[i]);
        }
        int sum = 0;
        int counter = 0;
        while (counter < numberOfStudents) {
            sum += points[counter];
            counter++;
        }
        double average = (double) sum / numberOfStudents;
        System.out.println("Średnia punktów w grupie: " + average);
    }

    static void countPositiveAndNegativeNumbers() {
        System.out.println("\nPodaj 10 liczb:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        long numberOfNegativeNumbers = Arrays.stream(numbers).filter(x -> x < 0).count();
        System.out.println("Liczba cyfr ujemnych: " + numberOfNegativeNumbers);
        long sumOfNegativeNumbers = Arrays.stream(numbers).filter(x -> x < 0).sum();
        System.out.println("Suma cyfr ujemnych: " + sumOfNegativeNumbers);
        long numberOfPositiveNumbers = Arrays.stream(numbers).filter(x -> x > 0).count();
        System.out.println("Liczba cyfr dodatnich: " + numberOfPositiveNumbers);
        long sumOfPositiveNumbers = Arrays.stream(numbers).filter(x -> x > 0).sum();
        System.out.println("Suma cyfr dodatnich: " + sumOfPositiveNumbers);
    }

    static void countSumOfEvenNumbers() {
        countSumOfEvenNumbersInSeries(getSeries());
    }

    private static int[] getSeries() {
        System.out.println("\nPodaj liczbę wyrazów ciągu:");
        int n = scanner.nextInt();
        boolean isValid = false;
        do {
            if (n > 0) {
                isValid = true;
            } else {
                System.out.println("Liczba wyrazów ciagu musi być większa od 0!");
                n = scanner.nextInt();
            }
        } while (!isValid);

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(55) - 10;
        }
        System.out.println("Ciąg o wyrazach: " + Arrays.toString(numbers));
        return numbers;
    }

    private static void countSumOfEvenNumbersInSeries(int[] numbers) {
        int sumOfEvenNumbers = Arrays.stream(numbers).filter(x -> x % 2 == 0).sum();
        System.out.println("Suma liczb parzystych: " + sumOfEvenNumbers);
    }

    static void countSumOfNEvenNumbers() {
        int[] series = getSeries();

        System.out.println("Podaj liczbę wyrazów ciągu do wylosowania:");
        int n = scanner.nextInt();
        boolean isValid = false;
        do {
            if (n < series.length) {
                isValid = true;
            } else {
                System.out.println("Liczba wyrazów do wylosowania musi być mniejsza od liczby wyrazów ciagu!");
                n = scanner.nextInt();
            }
        } while (!isValid);

        int[] chosenNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            chosenNumbers[i] = series[rand.nextInt(series.length)];
        }
        System.out.println("Wylosowane liczby: " + Arrays.toString(chosenNumbers));

        countSumOfEvenNumbersInSeries(chosenNumbers);
    }

    static void isPalindrome() {
        System.out.println("\nPodaj słowo:");
        scanner.nextLine();
        String word = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(word);
        String reversedWord = stringBuilder.reverse().toString();
        boolean isPalindrome = word.equals(reversedWord);
        System.out.println(isPalindrome ? "Słowo jest palindromem" : "Słowo nie jest palindromem");
    }
}