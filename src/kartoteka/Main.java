package kartoteka;
//import kartoteka.mockup.*;
import kartoteka.impl.*;
public class Main {

    public static void main(String[] args) {


        Osoba mat = new Osoba("mati", "wilczewski");
        Osoba pau = new Osoba("Pauka", "Chmielewska");
        Kartoteka kart = new Kartoteka(2);
        kart.dodaj(mat);
        kart.dodaj(pau);
        kart.usun(pau);
        kart.usun(mat);
        kart.czyZawiera(mat);
        kart.czyZawiera(pau);
    }
}
