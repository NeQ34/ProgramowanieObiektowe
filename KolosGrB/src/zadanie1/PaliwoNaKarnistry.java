package zadanie1;

public class PaliwoNaKarnistry extends Paliwo<Integer> implements Kalkulator{
    private final double pojemnosc;

    public PaliwoNaKarnistry(String rodzaj, double cena, double iloscOktanow, int ilosc, double pojemnosc) {
        super(rodzaj, cena, iloscOktanow, ilosc);
        this.pojemnosc = pojemnosc;
    }

    @Override
    String getType() {
        return "Karnister";
    }
    @Override
    public double obliczZaLitr() {
        return getIlosc()*getCena()/pojemnosc;
    }

    @Override
    public String toString() {
        return super.toString()+
                "pojemnosc=" + pojemnosc +
                '}';
    }
}
