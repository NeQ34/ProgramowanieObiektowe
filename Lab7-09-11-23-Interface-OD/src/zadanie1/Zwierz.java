package zadanie1;

public abstract class Zwierz {
    private String imie = "bez imienia";

    public Zwierz(String imie) {
        this.imie = imie;
    }

    abstract String getTyp();

    @Override
    public String toString() {
        return "imie: " + imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
