package kartoteka;

public class Osoba {
    public String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Osoba)) return false;
        Osoba os = (Osoba) obj;

            return getImie() == os.getImie() && getNazwisko() == os.getNazwisko();

    }
}