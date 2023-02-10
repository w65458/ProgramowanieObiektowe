package Lab4.LAB_11.Zadanie3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj nazwe pliku: ");
        String filename = scanner.nextLine();
        System.out.println("Podaj dzien urodzenia: ");
        int dzien = scanner.nextInt();
        System.out.println("Podaj miesiac urodzenia: ");
        int miesiac = scanner.nextInt();
        System.out.println("Podaj rok urodzenia: ");
        int rok = scanner.nextInt();

        try (DataOutputStream bos = new DataOutputStream(new FileOutputStream(filename))) {
            bos.writeInt(dzien);
            bos.writeInt(miesiac);
            bos.writeInt(rok);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
