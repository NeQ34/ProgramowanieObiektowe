package zadanie1;

public class Utils {
    public static <K,V> boolean compare(Pair<K,V> p, Pair<K,V> q){
        return (p.getValue().equals(q.getValue()));
    }
}
