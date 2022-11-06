package Lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];
        drawRandomNumbers(numbers);
        countSumAndAverage(numbers);
        System.out.println("================");

        int[] firstArray = new int[6];
        drawRandomNumbers(firstArray);
        int[] secondArray = new int[5];
        drawRandomNumbers(secondArray);
        printEverySecondNumberOfTwoArrays(firstArray, secondArray);
        System.out.println("================");

        String[] stringArray = new String[5];
        initializeStringArray(stringArray);
        printStringArrayInUpperCase(stringArray);
        System.out.println("================");

        String[] words = new String[5];
        getUserInputWordsInReversedOrder(words);
        printStringArray(words);
        System.out.println("================");

        int[] userNumbers  = new int[8];
        getUserInputNumbers(userNumbers);
        printSortedArray(userNumbers);
        System.out.println("================");

        int[] userInputNumbers  = new int[5];
        getUserInputNumbers(userInputNumbers);
        printArrayOfFactorials(userInputNumbers);
        System.out.println("================");

        String[] wordsArray1 = new String[5];
        String[] wordsArray2 = new String[5];
        getUserInputWordsForTwoArrays(wordsArray1, wordsArray2);
        checkIfArraysAreEqual(wordsArray1, wordsArray2);
        System.out.println("================");
    }

    static void countSumAndAverage(int[] array){
        int sum = 0;
        for (Integer num: array) {
            sum += num;
        }
        System.out.print("Suma: " + sum + "\n");
        System.out.print("Średnia: " + sum / array.length + "\n");
    }

    static void drawRandomNumbers(int[] targetArray) {
        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = random.nextInt(101);
            System.out.print("" + targetArray[i] + " ");
        }
        System.out.println();
    }

    private static void printEverySecondNumberOfTwoArrays(int[] firstArray, int[] secondArray) {
        int[] tempArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, tempArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, tempArray, firstArray.length, secondArray.length);
        System.out.println();
        for (int i = 0; i < tempArray.length; i++) {
            if (i % 2 != 0)
                System.out.print("" + tempArray[i] + " ");
        }
        System.out.println();
    }

    static void initializeStringArray(String[] stringArray) {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 5;
        Random random = new Random();
        for (int i = 0; i < stringArray.length; i++) {
            String generatedString = random.ints(leftLimit, rightLimit + 1)
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            stringArray[i] = generatedString;
        }
    }

    static void printStringArrayInUpperCase(String[] stringArray){
        for (String word : stringArray){
            System.out.println(word.toUpperCase());
        }
    }

    static void getUserInputWordsInReversedOrder(String[] words){
        System.out.println("Podaj " + words.length + " słów:");
        int k = 4;
        while(k >= 0) {
            String word = scanner.nextLine();
            String reversedWord = new StringBuilder(word).reverse().toString();
            words[k] = reversedWord;
            k--;
        }
    }

    static void printStringArray(String[] stringArray){
        for (String word : stringArray){
            System.out.println(word);
        }
    }

    private static void getUserInputNumbers(int[] userNumbers) {
        System.out.println("Podaj " + userNumbers.length + " liczb:");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }
        scanner.nextLine();
    }

    static void printSortedArray(int[] array) {
        Arrays.sort(array);
        for (int number : array) {
            System.out.print("" + number + " ");
        }
        System.out.println();
    }

    static void printArrayOfFactorials(int[] array) {
        for (int number:array) {
            System.out.print("" + countFactorial(number) + " ");
        }
        System.out.println();
    }

    static long countFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static void getUserInputWordsForTwoArrays(String[] words1, String[] words2) {
        System.out.println("Podaj " + words1.length + " słów:");
        for (int i = 0; i < words1.length; i++) {
            words1[i] = words2[i] = scanner.nextLine();
        }
    }

    private static void checkIfArraysAreEqual(String[] wordsArray1, String[] wordsArray2) {
        String result = Arrays.equals(wordsArray1, wordsArray2) ? "Tablice są takie same" : "Tablice są różne";
        System.out.println(result);
    }

}