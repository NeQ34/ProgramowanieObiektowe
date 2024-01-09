package test;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        KlasaZewnetrzna zewnetrzna = new KlasaZewnetrzna(2);
        zewnetrzna.metoda1();

        KlasaZewnetrzna.KlasaWewnetrzna wewnetrzna = new KlasaZewnetrzna(1).new KlasaWewnetrzna();//1 sposob

        KlasaZewnetrzna.KlasaWewnetrzna wewnetrzna2 = zewnetrzna.new KlasaWewnetrzna();//2 sposob

        Predicate<Integer> predicate = zewnetrzna.new KlasaWewnetrzna();// przypadek z implements

        KlasaZewnetrzna anonimowa = new KlasaZewnetrzna(1){
            @Override
            public void metoda1(){
                System.out.println("Klasa anonimowa");
            }
        };
        anonimowa.metoda1();

        //klasy anonimowe:
        Operacje operacje = new Operacje() {
            @Override
            public void operacja() {
                System.out.println("Klasa anonimowa");
            }
        };
        operacje.operacja();
    }
}
