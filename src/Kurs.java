public class Kurs {
    private String nazwaKursu;
    private PracownikBadawczoDydaktyczny prowadzacy;
    private int liczbaECTS;

    public Kurs(String nazwaKursu, PracownikBadawczoDydaktyczny prowadzacy, int liczbaECTS) {
        this.nazwaKursu = nazwaKursu;
        this.prowadzacy = prowadzacy;
        this.liczbaECTS = liczbaECTS;
    }


}
