package Lab4.LAB_07;

public class Main {
    public static void main(String[] args) {
        Statek statek = new Statek();
        Samolot samolot = new Samolot();
        statek.plyn();
        samolot.lec();

        Wieloryb wieloryb = new Wieloryb();
        wieloryb.plyn();
        wieloryb.zanurz();
        wieloryb.jedz();
        wieloryb.wynurz();
        wieloryb.wydalaj();
    }
}
