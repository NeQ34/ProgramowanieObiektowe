package zad6;

public class Main {
    public static void main(String[] args) {
        ascii("Ala ma kota");
    }
    public static void ascii(String s){
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i)+" : "+(int) s.charAt(i));
        }
    }
}
