package Lab4.LAB_10.Zadanie5;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Film> prywatnaKolekcja = new HashMap<>();
        prywatnaKolekcja.put(1, new Horror(120, "Blair Witch", false, "horror"));
        prywatnaKolekcja.put(2, new Komedia(240, "Jak poznalem wasza matke", true, "komedia"));
        prywatnaKolekcja.put(3, new Horror(160, "Krzyk", true, "horror"));

        for (Map.Entry<Integer, Film> entry : prywatnaKolekcja.entrySet()) {
            System.out.println("Nr: " + entry.getKey() + ", Tytuł: " + entry.getValue().getTytul() +
                    ", Czas trwania: " + entry.getValue().getCzasTrwania() +
                    ", Obejrzany: " + entry.getValue().isCzyObejrzany() +
                    ", Gatunek: " + (entry.getValue() instanceof Horror ? "Horror" : "Komedia"));
        }
    }
}
