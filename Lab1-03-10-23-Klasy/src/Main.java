import zad1.Seans;

public class Main {
    public static void main(String[] args) {
        Seans s = new Seans("Kevin sam w Nowym Jorku","Chris Columbus",120,30.5,75);
        s.wyswietlInformacje();
        s.zarezerwujMiejsce();
        s.zarezerwujMiejsce();
        s.zarezerwujMiejsce();
        s.zarezerwujMiejsce();
        s.zarezerwujMiejsce();
        s.wyswietlZarezerwowane();
    }
}