package zadanie2;

public class Osoba {
    private final String pesel;
    private final String imie;
    private final String nazwisko;

    public Osoba(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel='" + pesel + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
