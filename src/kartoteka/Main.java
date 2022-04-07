package kartoteka;
//import kartoteka.mockup.*;
import kartoteka.impl.*;
public class Main {

    public static void main(String[] args) {
        Kartoteka kart=new Kartoteka(5);
        Osoba mat = new Osoba("Mateusz", "Wilczewski");
        kart.dodaj(mat);
        kart.dodaj(new Osoba("Krzysztof", "Grzyb"));
        kart.dodaj(new Osoba("Jan","Bąk"));
        Osoba osobnik=kart.pobierz(2);
        kart.usun(osobnik);
        System.out.println(kart.czyZawiera(osobnik));
        System.out.println(osobnik.getImie());
        System.out.println( "Kartoteka ma rozmiar: " + kart.rozmiar());



    }
}
