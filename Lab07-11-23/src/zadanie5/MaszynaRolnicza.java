package zadanie5;

public class MaszynaRolnicza extends Pojazd{
    private String podkategoria;

    public MaszynaRolnicza(String model, String marka, String kolor, String stan, double cena, String podkategoria) {
        super(model, marka, kolor, stan, cena);
        this.podkategoria = podkategoria;
    }

    public String getPodkategoria() {
        return podkategoria;
    }

    public void setPodkategoria(String podkategoria) {
        this.podkategoria = podkategoria;
    }

    @Override
    public String toString() {
        return "podkategoria: " + podkategoria + super.toString();
    }
}
