package Lab4.LAB_10.Zadanie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Kangur> kangury = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            kangury.add(new Kangur(i));
        }
        kangury.forEach(kangur -> System.out.println("Kangur numer: " + kangur.skok()));

        Iterator<Kangur> iterator = kangury.iterator();
        while (iterator.hasNext()) {
            Kangur kangur = iterator.next();
            System.out.println("Kangur numer: " + kangur.skok());
        }

        List<String> imiona = List.of("Jacek", "Krzysztof", "Marek", "Piotr", "Tomasz", "Wojciech", "Zbigniew", "Janusz", "Mariusz", "Paweł");
        Map<String, Kangur> mapaImionaKangury = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            mapaImionaKangury.put(imiona.get(i), new Kangur(i));
        }
        for (String imie : mapaImionaKangury.keySet()) {
            System.out.println("Kangur numer: " + mapaImionaKangury.get(imie).skok() + " ma na imię: " + imie);
        }

        LinkedHashMap<String, Kangur> posortowaneKangury = new LinkedHashMap<>();
        mapaImionaKangury.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> posortowaneKangury.put(x.getKey(), x.getValue()));
        System.out.println("Posortowane kangury:");
        for (String imie : posortowaneKangury.keySet()) {
            System.out.println("Kangur numer: " + posortowaneKangury.get(imie).skok() + " ma na imię: " + imie);
        }
    }
}

