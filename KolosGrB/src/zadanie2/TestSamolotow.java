package zadanie2;

public class TestSamolotow {
    public static void main(String[] args) {
        Samolot s1 = new Samolot(300,700);
        //s1.zwiekszPredkosc(500);
        //System.out.println("Aktualna predkosc: "+s1.getAktualnaPredkoscLotu());
        s1.zmniejszPredkosc(200);
        System.out.println("Aktualna predkosc: "+s1.getAktualnaPredkoscLotu());
    }
}
