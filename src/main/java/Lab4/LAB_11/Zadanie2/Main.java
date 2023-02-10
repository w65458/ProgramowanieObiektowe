package Lab4.LAB_11.Zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj sciezke pliku: ");
        String filePath = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCounter = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCounter++;
            }
            System.out.println("Liczba linii: " + lineCounter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
