package example;

public class Produkt<T> {
    private String nazwa;
    private T ilosc;

    public Produkt(String nazwa, T ilosc) {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public T getIlosc() {
        return ilosc;
    }

    public void setIlosc(T ilosc) {
        this.ilosc = ilosc;
    }
}
