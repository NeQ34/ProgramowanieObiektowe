package zadanie1;

public class WhiteCollarWorker extends Worker{
    private double salary; //pensja miesieczna

    public WhiteCollarWorker(String imie, String nazwisko, String pesel, int rokUrodzenia, int rokZatrudnienia, Plec plec, String company, String occupation, double salary) {
        super(imie, nazwisko, pesel, rokUrodzenia, rokZatrudnienia, plec, company, occupation);
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
