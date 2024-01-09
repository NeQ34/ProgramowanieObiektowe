package zadanie1;

public abstract class Paliwo<T extends Number> {
    private final String rodzaj;
    private double cena;
    private double iloscOktanow;
    private T ilosc;

    public Paliwo(String rodzaj, double cena, double iloscOktanow, T ilosc) {
        this.rodzaj = rodzaj;
        this.cena = cena;
        this.iloscOktanow = iloscOktanow;
        this.ilosc = ilosc;
    }

    abstract String getType();

    @Override
    public String toString() {
        return "Paliwo{" +
                "rodzaj='" + rodzaj + '\'' +
                ", cena=" + cena +
                ", iloscOktanow=" + iloscOktanow +
                ", ilosc=" + ilosc +
                '}';
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getIloscOktanow() {
        return iloscOktanow;
    }

    public void setIloscOktanow(double iloscOktanow) {
        this.iloscOktanow = iloscOktanow;
    }

    public T getIlosc() {
        return ilosc;
    }

    public void setIlosc(T ilosc) {
        this.ilosc = ilosc;
    }
}
