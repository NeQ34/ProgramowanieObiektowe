package zadanie1;

public class PaliwoNaLitry extends Paliwo<Double> implements Kalkulator{
    public PaliwoNaLitry(String rodzaj, double cena, double iloscOktanow, double ilosc) {
        super(rodzaj, cena, iloscOktanow, ilosc);
    }

    @Override
    public double obliczZaLitr() {
        return getCena();
    }

    @Override
    String getType() {
        return "Litry";
    }
}
