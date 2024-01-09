package zadanie1;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1,"apple");
        Pair<Integer, String> p2 = new Pair<>(2,"pear");
        Pair<Integer, String> p3 = new Pair<>(1,"apple");

        System.out.println(Utils.compare(p1,p2));
        System.out.println(Utils.compare(p1,p3));
    }
}
