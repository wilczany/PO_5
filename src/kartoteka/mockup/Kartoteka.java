package kartoteka.mockup;

import kartoteka.Osoba;

public class Kartoteka {


    void dodaj(Osoba osoba){}
    void usun(Osoba osoba){}
    int rozmiar(){return 1;}
    boolean czyZawiera(Osoba osoba){return true;}
      public Osoba pobierz(int index){return new Osoba("Gal","Anonim");}

}
