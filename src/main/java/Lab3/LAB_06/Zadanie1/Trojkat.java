package Lab3.LAB_06.Zadanie1;

public class Trojkat extends Figura {
    double wys = 0, podst = 0;

    Trojkat(double wys, double podst) {
        this.wys = wys;
        this.podst = podst;
    }

    public Trojkat(String kolor, double wys, double podst) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    @Override
    String opis() {
        return  "Klasa Trojkat. Kolor obiektu: " + kolor;
    }
}