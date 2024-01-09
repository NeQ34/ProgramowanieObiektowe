package zad5;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String dataUrodzenia;
    private char plec;
    private int wiek;

    public Person(){
        readData();
        readOtherData();
    }

    public void readOtherData(){
        readDataUrodzenia();
        readPlec();
        readWiek();
    }

    public void readData(){
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj imie: "); imie = s.next();
        System.out.print("Podaj nazwisko: "); nazwisko = s.next();
        System.out.print("Podaj pesel: "); pesel = s.next();
    }
    public void readDataUrodzenia(){
        dataUrodzenia = "19"+pesel.substring(0,2)+"y "+pesel.substring(2,4)+"m "+pesel.substring(4,6)+"d";
    }
    public void readPlec(){
        String czyplec = pesel.substring(pesel.length()-1);
        if(Integer.parseInt(czyplec)%2==0) plec = 'K';
        else plec = 'M';
    }
    public void readWiek(){
        String rokUrodzenia = "19"+pesel.substring(0,2);
        wiek = LocalDate.now().getYear()-Integer.parseInt(rokUrodzenia);
    }

    @Override
    public String toString() {
        return "imie: " + imie +
                "\nnazwisko: " + nazwisko +
                "\npesel: " + pesel +
                "\ndataUrodzenia: " + dataUrodzenia +
                "\nplec: " + plec +
                "\nwiek: " + wiek;
    }
}
