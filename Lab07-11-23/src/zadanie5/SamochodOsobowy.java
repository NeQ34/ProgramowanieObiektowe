package zadanie5;

public class SamochodOsobowy extends Pojazd{
    private String typ;

    public SamochodOsobowy(String model, String marka, String kolor, String stan, double cena, String typ) {
        super(model, marka, kolor, stan, cena);
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Typ:" + typ + super.toString();
    }
}
