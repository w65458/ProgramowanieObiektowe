package Lab4.LAB_10.Zadanie5;

public class Horror extends Film {

    private final String gatunek;

    public Horror(int czasTrwania, String tytul, boolean czyObejrzany, String gatunek) {
        super(czasTrwania, tytul, czyObejrzany);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    @Override
    public String toString() {
        return super.toString() +
                "gatunek='" + gatunek + '\'' +
                '}';
    }
}
