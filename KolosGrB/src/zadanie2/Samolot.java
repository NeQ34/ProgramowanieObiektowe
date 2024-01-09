package zadanie2;

public class Samolot {
    private double aktualnaPredkoscLotu;
    private final double maxPredkoscLodu;

    public Samolot(double aktualnaPredkoscLotu, double maxPredkoscLodu) {
        this.aktualnaPredkoscLotu = aktualnaPredkoscLotu;
        this.maxPredkoscLodu = maxPredkoscLodu;
    }

    public void zwiekszPredkosc(double km) throws SamolotowyException{
        if(km<=0) throw new SamolotowyException("Predkosc nie moze byc <=0");
        if(km+aktualnaPredkoscLotu>maxPredkoscLodu) throw new SamolotowyException("Samolot nie moze leciec wiecej niz predkosc maksymalna");
        aktualnaPredkoscLotu+=km;
    }
    public void zmniejszPredkosc(double km){
        if(km<=0) throw new SamolotowyException("Nie mozesz zmniejszyc predkosci o 0");
        if(aktualnaPredkoscLotu-km<0) throw new SamolotowyException("Samolot nie moze leciej mniej niz 0 km/h");
        aktualnaPredkoscLotu-=km;
    }

    public double getAktualnaPredkoscLotu() {
        return aktualnaPredkoscLotu;
    }

    public double getMaxPredkoscLodu() {
        return maxPredkoscLodu;
    }
}
