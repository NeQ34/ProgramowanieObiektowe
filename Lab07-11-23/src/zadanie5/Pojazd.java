package zadanie5;

public abstract class Pojazd {
    private String model;
    private String marka;
    private String kolor;
    private String stan;
    private double cena;


    public Pojazd(String model, String marka, String kolor, String stan, double cena) {
        this.model = model;
        this.marka = marka;
        this.kolor = kolor;
        this.stan = stan;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getKolor() {
        return kolor;
    }
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getStan() {
        return stan;
    }
    public void setStan(String stan) {
        this.stan = stan;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "\n================="+
                "\nModel: " + model +
                "\nmarka: " + marka+
                "\nkolor: " + kolor+
                "\nstan: " + stan+
                "\ncena: " + cena+
                "\n=================";
    }
}
