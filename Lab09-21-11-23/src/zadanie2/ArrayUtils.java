package zadanie2;

public class ArrayUtils {
    public static <T> T getCentral(T[] tab){
        if(tab == null||tab.length==0) return null;
        else return tab[tab.length/2];
    }
    public static <T> void wyswietl(T[] tab){
        for(T t: tab){
            System.out.println(t);
        }
    }
}
