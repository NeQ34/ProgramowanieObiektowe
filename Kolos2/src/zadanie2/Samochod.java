package zadanie2;

public class Samochod {
    private int aktualnaPredkosc;
    private final int maxPredkosc;

    public Samochod(int maxPredkosc) {
        this.aktualnaPredkosc = 50;
        this.maxPredkosc = maxPredkosc;
    }

    public int getAktualnaPredkosc() {
        return aktualnaPredkosc;
    }

    public int getMaxPredkosc() {
        return maxPredkosc;
    }
    public void zwiekszPredkosc(int km) throws SamochodowyException{
        if(aktualnaPredkosc + km > maxPredkosc) throw new SamochodowyException("Nie mozesz jechac wiecej niz predkosc maksymalna");
        aktualnaPredkosc+=km;
    }
    public void zmniejszPredkosc(int km) throws SamochodowyException{
        if(aktualnaPredkosc-km<0) throw new SamochodowyException("Nie mozesz jechac mniej od 0");
        aktualnaPredkosc-=km;
    }
}
