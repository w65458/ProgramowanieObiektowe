package Lab3.LAB_06;

public class Figura {
    Punkt punkt;
    String kolor = "bialy";

    Figura() {
        punkt = new Punkt(0,0);
    }

    Figura(String kolor) {
        this.kolor = kolor;
    }

    Figura(Punkt punkt) {
        this.punkt = punkt;
    }

    String getKolor() {
        return kolor;
    }

    String opis() {
        return "Klasa Figura. Kolor obiektu: " + kolor;
    }


}