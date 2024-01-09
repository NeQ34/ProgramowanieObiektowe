package zadanie1;

public class TestPaliw {
    public static void main(String[] args) {
        PaliwoNaKarnistry paliwoNaKarnistry = new PaliwoNaKarnistry("Benzyna",60,95,5,10000);
        PaliwoNaLitry paliwoNaLitry = new PaliwoNaLitry("Benzyna",7,98,1000.0);

        System.out.println(paliwoNaKarnistry.toString());
        System.out.println("==");
        System.out.println(paliwoNaLitry.toString());

        System.out.println(paliwoNaKarnistry.obliczZaLitr());
        System.out.println(paliwoNaLitry.obliczZaLitr());

        Kalkulator[] paliwa = {paliwoNaKarnistry,paliwoNaLitry};
        System.out.println("Suma: "+Serwis.obliczSume(paliwa));
    }
}
