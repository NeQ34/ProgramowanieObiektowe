package zadanie5;

public class Main {
    public static void main(String[] args) {
        Pojazd p1 = new SamochodOsobowy("s40","Volvo","czerwony","niesprzedany",9000,"sedan");
        Pojazd p2 = new MaszynaRolnicza("Lexion 600","Classm","biało-zielony","sprzedany",315000,"kombajn");
        Pojazd p3 = new SamochodOsobowy("T460 E6","Renault","zielony","niesprzedany",219000,"null");

        Pojazdy pojazdy = new Pojazdy(new Pojazd[]{p1,p2,p3});
        pojazdy.wyswietlInfo();
    }
}
