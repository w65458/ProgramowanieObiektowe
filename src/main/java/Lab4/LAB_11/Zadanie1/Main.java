package Lab4.LAB_11.Zadanie1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj sciezke pliku: ");
        String filePath = scanner.nextLine();
        System.out.println("Podaj tekst do zapisania: ");
        String line = scanner.nextLine();
        StringBuilder text = new StringBuilder(line);
        while (!line.equals("-")) {
            line = scanner.nextLine();
            text.append(System.lineSeparator());
            text.append(line);
        }
        text.deleteCharAt(text.length() - 1);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(text.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
