package example;

public class Main {
    public static void main(String[] args) {
        Produkt<Integer> wodaWButelce = new Produkt<>("woda",1);//XD
        Produkt<Double> wodaNaLitry = new Produkt<>("woda",1.5);

        WodaNaLitry wodaNaLitry1 = new WodaNaLitry("Woda",2.5);//XD

        System.out.println(getValue(2));
        System.out.println(getValue("Liczba"));
        System.out.println(getValue("a"));
    }

    public static<E> E getValue(E value){//XD
        return value;
    }
}
