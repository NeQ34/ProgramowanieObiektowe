package zadanie4;

public class KontoZOplatami extends Konto{
    private static final int  LICZBA_BEZPLATNYCH_TRANSAKCJI = 5;
    private static final double  OPLATA_ZA_TRANSAKCJE = 0.5;
    private int liczbaTransakcji;

    public KontoZOplatami(String imie_nazwisko, double saldo, int liczbaTransakcji) {
        super(imie_nazwisko, saldo);
        this.liczbaTransakcji = 0;
    }

    public void wplata(double n){
        double saldo = getSaldo();
        if(n>0) setSaldo(saldo+n);
        else System.out.println("Błędne dane");
        liczbaTransakcji++;
        naliczOplateZaTransakcje();
    }
    public boolean wyplata(double n){
        liczbaTransakcji++;
        naliczOplateZaTransakcje();
        double saldo = getSaldo();
        if(n<saldo && saldo>0){ setSaldo(n); return true;}//XDDDDDDDDD
        else return false;
    }
    public void naliczOplateZaTransakcje(){
        if(LICZBA_BEZPLATNYCH_TRANSAKCJI<liczbaTransakcji){
            double saldo = getSaldo();
            setSaldo(saldo-OPLATA_ZA_TRANSAKCJE);
        }
    }
    public void wyswietlInfo(){
        System.out.println("Liczba transakcji: "+liczbaTransakcji);
        super.wyswietlInfo();
    }
}
