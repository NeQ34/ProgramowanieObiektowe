package zadanie2;

public class Main {
    public static void main(String[] args) {
        String[] s1 = {"ala","aaa","eeee","ooooo"};
        Integer[] s2 = {4,5,3,2,5,6};
        Character[] s3 = {'a','b','c','d'};
        Character[] s4 = {};

        System.out.println(ArrayUtils.getCentral(s1));
        System.out.println(ArrayUtils.getCentral(s2));
        System.out.println(ArrayUtils.getCentral(s3));
        System.out.println(ArrayUtils.getCentral(s4));


        ArrayUtils.wyswietl(s1);
    }
}
