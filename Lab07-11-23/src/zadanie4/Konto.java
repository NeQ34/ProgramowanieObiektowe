package zadanie4;

public abstract class Konto {
    private String imie_nazwisko;
    private double saldo;

    public Konto(String imie_nazwisko, double saldo) {
        this.imie_nazwisko = imie_nazwisko;
        this.saldo = saldo;
    }

    public String getImie_nazwisko() {
        return imie_nazwisko;
    }
    public void setImie_nazwisko(String imie_nazwisko) {
        this.imie_nazwisko = imie_nazwisko;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void wyswietlInfo(){
        System.out.println(
                "Imie i nazwisko: "+imie_nazwisko
                +"saldo: "+saldo);
    }
    public double zwrocStanKonta(){
        return saldo;
    }
    public void wplata(double n){
        if(n>0) saldo += n;
        else System.out.println("Błędne dane");
    }
    public boolean wyplata(double n){
        if(n<saldo && saldo>0){ saldo-=n; return true;}
        else return false;
    }

}
