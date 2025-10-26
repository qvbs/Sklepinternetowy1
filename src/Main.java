import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Witaj w sklepie internetowym! ===");

        ArrayList<Produkt> produkty = new ArrayList<>();

        produkty.add(new Elektronika("Laptop", 3500.0,24));
        produkty.add(new Elektronika("Smartfon", 2500.0, 12));
        produkty.add(new Odziez("Koszulka", 79.99, "L"));
        produkty.add(new Odziez("Bluza", 149.99, "M"));

        System.out.println("\nDostępne produkty:");
        for (Produkt p : produkty) {
            p.wyswietlInfo();
        }

        System.out.println("\nDziękujemy ");
    }
}
