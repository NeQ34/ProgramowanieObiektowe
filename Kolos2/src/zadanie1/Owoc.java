package zadanie1;

public abstract class Owoc<T extends Number> {
    private final String rodzaj;
    private double cena;
    private String krajPochodzenia;
    private T ilosc;

    public Owoc(String rodzaj, double cena, String krajPochodzenia, T ilosc) {
        this.rodzaj = rodzaj;
        this.cena = cena;
        this.krajPochodzenia = krajPochodzenia;
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Owoc{" +
                "rodzaj='" + rodzaj + '\'' +
                ", cena=" + cena +
                ", krajPochodzenia='" + krajPochodzenia + '\'' +
                ", ilosc=" + ilosc +
                '}';
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }

    public void setIlosc(T ilosc) {
        this.ilosc = ilosc;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public double getCena() {
        return cena;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public T getIlosc() {
        return ilosc;
    }
}
