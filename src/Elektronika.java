public class Elektronika extends Produkt {
    private int gwarancja;

    public Elektronika(String nazwa, double cena, int gwarancja) {
        super(nazwa, cena);
        this.gwarancja = gwarancja;
    }

    @Override
    public void wyswietlInfo() {
        System.out.println("Elektronika: " + getNazwa() + ", cena: " + getCena() +
                " zł, gwarancja: " + gwarancja + " miesięcy");
    }
}
