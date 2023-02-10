package Lab4.LAB_11.Zadanie4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj nazwe pliku: ");
        String filename = scanner.nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int dzien = dis.readInt();
            int miesiac = dis.readInt();
            int rok = dis.readInt();
            System.out.println("Data urodzenia: " + dzien + "." + miesiac + "." + rok);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
