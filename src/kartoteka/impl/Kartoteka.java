package kartoteka.impl;

import kartoteka.Osoba;

public class Kartoteka {

        Osoba []baza;
        int rozmiar;
        int ilosc=0;
        final int std_rozmiar= 10;
        public Kartoteka(int x){
            if(x<=0){
                System.out.println("Nieprawidlowy rozmiar kartoteki");
                baza=new Osoba[std_rozmiar];
                rozmiar=std_rozmiar;
            }
            else {
                baza = new Osoba[x];
                rozmiar=x;
            }
        }

        public Kartoteka () {
        baza=new Osoba[std_rozmiar];
        rozmiar=std_rozmiar;
        }

        public void dodaj(Osoba osoba){
            baza[ilosc]=osoba;
            ilosc++;
        }
    public void usun(Osoba osoba){
            if(ilosc==0)
                System.out.println("Kartoteka nie zawiera osob");
        for(int i=0;i<ilosc;i++){
            if( osoba.equals(baza[i])){
                while (i < ilosc-1)
                    baza[i] = baza[++i];
                    ilosc--;
                    return;

            }

        }
        System.out.println("Nie znaleziono osoby");

    }
    void usun(int index){
            //baza[index];

    }
    int rozmiar(){return 1;}

    public boolean czyZawiera(Osoba os){

        for(int i=0;i<ilosc;i++) {
            if(os.equals(baza[i])){
                System.out.println("znaleziono");
                return true;
            }

    }
        return false;
    }
    public Osoba pobierz(int index){return new Osoba("Gal","Anonim");}
}
