package zadanie4;

public class KontoOszczednosciowe extends Konto{
    private double oprocentowanie;

    public KontoOszczednosciowe(String imie_nazwisko, double saldo, double oprocentowanie) {
        super(imie_nazwisko, saldo);
        this.oprocentowanie = oprocentowanie;
    }

    public double obliczOdsetki(){
        return (getSaldo() * oprocentowanie)/365;
    }
    public double naliczOdsetki(){
        return 0;
    }
}
