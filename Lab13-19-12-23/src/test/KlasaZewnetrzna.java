package test;

import java.util.function.Predicate;

public class KlasaZewnetrzna {
    private int liczba;

    public KlasaZewnetrzna(int liczba) {
        this.liczba = liczba;
    }
    public KlasaWewnetrzna metoda(){
        return new KlasaWewnetrzna();//zwraca liczbe xD
    }

    public void metoda1(){
        System.out.println("Klasa zewnetrzna");
    }

    public class KlasaWewnetrzna implements Predicate<Integer> {
        private int liczba;
        public void wyswietlWew(){
            int liczbaW = KlasaZewnetrzna.this.liczba;

            System.out.println("Klasa wewnetrzna");
        }

        @Override
        public boolean test(Integer integer) {
            return integer>0;
        }
    }
}
