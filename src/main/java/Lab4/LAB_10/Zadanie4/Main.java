package Lab4.LAB_10.Zadanie4;

import Lab4.LAB_10.Zadanie3.Stos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {
        String[] produkty = {"Mleko", "Jajka", "Chleb", "Masło", "Ser", "Woda", "Kawa", "Herbata", "Cukier", "Sok"};

        Stos<String> koszyk = new Stos<>();
        int i = random.nextInt(15);
        while (i > 0) {
            koszyk.push(produkty[random.nextInt(produkty.length)]);
            i--;
        }

        Map<String, Stos<String>> kolejka = new HashMap<>();
        List<String> klienci = List.of("Jan", "Piotr", "Krzysztof", "Marek", "Tomasz", "Michał", "Paweł", "Adam", "Kamil", "Jakub");
        klienci.forEach(klient -> kolejka.put(klient, koszyk));

        for (String klient : kolejka.keySet()) {
            if (klient.equals("Michał")) {
                System.out.println("Klient " + klient + " ma w koszyku: " + kolejka.get(klient));
            }
        }

    }
}
