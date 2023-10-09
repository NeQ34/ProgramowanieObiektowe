package zad1;

public class Seans {
    private String nazwa;
    private String nazwisko;
    private int dlugoscFilmu;
    private double cena;
    private int miejsca;
    private boolean tablica[];

    public Seans(String nazwa, String nazwisko, int dlugoscFilmu, double cena, int miejsca) {
        this.nazwa = nazwa;
        this.nazwisko = nazwisko;
        this.dlugoscFilmu = dlugoscFilmu;
        this.cena = cena;
        this.miejsca = miejsca;

        tablica = new boolean[miejsca];
        for(int i=0; i<tablica.length; i++) {
            tablica[i] = false;
        }
    }
    public double getCena() {return cena;}
    public void setCena(double cena) {this.cena = cena;}

    public void wyswietlZarezerwowane(){
        for(int i=0; i<tablica.length; i++){
            if(tablica[i]){
                System.out.println("Zarezerwowane miejsce: "+i);
            }
        }
    }
    public int zarezerwujMiejsce(){
        for(int i=1; i<tablica.length; i++){
            if(!tablica[i]){
                tablica[i] = true;
                return i;
            }
        }
        return -1;
    }
    public void wyswietlInformacje(){
        System.out.println(
                "Nazwa filmu:"+nazwa
                +"\nNazwisko: "+nazwisko
                +"\nDługość filmu: "+dlugoscFilmu+"min"
                +"\nCena: "+cena+"zł");
    }
}
