package zadanie1;

public class Serwis {
    public static double obliczSume(Kalkulator[] tab){
        double suma=0;
        for(Kalkulator k : tab){
            suma+=k.obliczZaLitr();
        }
        return suma;
    }
}
