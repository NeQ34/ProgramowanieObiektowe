package zadanie2;

public class Main {
    public static void main(String[] args) {
        try{
            Samochod s1 = new Samochod(120);
            s1.zwiekszPredkosc(10);
            System.out.println("Aktualna predkosc:"+s1.getAktualnaPredkosc());

            s1.zwiekszPredkosc(70);
            System.out.println("Aktualna predkosc:"+s1.getAktualnaPredkosc());

            s1.zmniejszPredkosc(50);
            System.out.println("Aktualna predkosc:"+s1.getAktualnaPredkosc());
        }catch(SamochodowyException e){
            System.out.println(e.getMessage());
        }
    }
}
