public class Odziez extends Produkt {
    private String rozmiar;

    public Odziez(String nazwa, double cena, String rozmiar) {
        super(nazwa, cena);
        this.rozmiar = rozmiar;
    }
    @Override
    public void wyswietlInfo() {
        System.out.println("Odzież: " + getNazwa() + ", cena: " + getCena() +
                " zł, rozmiar: " + rozmiar);
    }
}
