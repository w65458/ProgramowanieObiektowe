package Lab4.LAB_10.Zadanie5;

public class Film {

    private final int czasTrwania;
    private final String tytul;
    private final boolean czyObejrzany;

    public Film(int czasTrwania, String tytul, boolean czyObejrzany) {
        this.czasTrwania = czasTrwania;
        this.tytul = tytul;
        this.czyObejrzany = czyObejrzany;
    }

    public int getCzasTrwania() {
        return czasTrwania;
    }

    public String getTytul() {
        return tytul;
    }

    public String isCzyObejrzany() {
        return czyObejrzany ? "Tak" : "Nie";
    }

    @Override
    public String toString() {
        return "Film{" +
                "czasTrwania=" + czasTrwania +
                ", tytul='" + tytul + '\'' +
                ", czyObejrzany=" + czyObejrzany;
    }
}
