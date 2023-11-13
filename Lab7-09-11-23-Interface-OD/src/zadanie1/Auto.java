package zadanie1;

public class Auto extends Pojazd{
    private String marka;

    public Auto(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
}
