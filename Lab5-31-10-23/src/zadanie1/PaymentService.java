package zadanie1;

public class PaymentService extends Worker{
    private Worker[] workers;

    public PaymentService(String imie, String nazwisko, String pesel, int rokUrodzenia, int rokZatrudnienia, Plec plec, String company, String occupation, Worker[] workers) {
        super(imie, nazwisko, pesel, rokUrodzenia, rokZatrudnienia, plec, company, occupation);
        this.workers = workers;
    }

    public void displaySalariesInCompany(Worker[] workers){
        for(Worker w : workers){
            w.displaySalaryInformation();
        }
    }

    public double calculatePayments(){
        double suma=0;
        for(Worker w : workers){
            suma += w.calculatePayment();
        }
        return suma;
    }

    @Override
    public double calculatePayment() {
        return 0;
    }
}
