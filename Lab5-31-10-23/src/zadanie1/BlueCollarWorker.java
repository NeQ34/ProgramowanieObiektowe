package zadanie1;

public class BlueCollarWorker extends Worker{
    private double stawka; //stawka za 1h
    private int godz; //liczba przepracowanych godzin

    public BlueCollarWorker(String imie, String nazwisko, String pesel, int rokUrodzenia, int rokZatrudnienia, Plec plec, String company, String occupation, double stawka, int godz) {
        super(imie, nazwisko, pesel, rokUrodzenia, rokZatrudnienia, plec, company, occupation);
        this.stawka = stawka;
        this.godz = godz;
    }

    public double calculatePayment(){
        return stawka*godz;
    }
}
