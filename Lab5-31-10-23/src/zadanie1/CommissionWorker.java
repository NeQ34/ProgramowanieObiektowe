package zadanie1;

public class CommissionWorker extends Worker{
    private double[] monthlySalaries;

    public CommissionWorker(String imie, String nazwisko, String pesel, int rokUrodzenia, int rokZatrudnienia, Plec plec, String company, String occupation, double[] monthlySalaries) {
        super(imie, nazwisko, pesel, rokUrodzenia, rokZatrudnienia, plec, company, occupation);
        this.monthlySalaries = monthlySalaries;
    }

    @Override
    public double calculatePayment() {
        double ostatni = monthlySalaries.length-1;
        return ostatni;
    }

    public double calculateAverageSalary(){
        return calculateTotalIncome()/monthlySalaries.length;
    }
    public double calculateTotalIncome(){
        double suma=0;
        for(int i=0; i<monthlySalaries.length; i++){
            suma+=monthlySalaries[i];
        }
        return suma;
    }
    public int calculateBiggerSalaries(double a){
        int suma=0;
        for(int i=0; i<monthlySalaries.length; i++){
            if(monthlySalaries[i]>a) suma++;
        }
        return suma;
    }
}
