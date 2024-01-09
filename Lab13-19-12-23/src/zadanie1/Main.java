package zadanie1;

public class Main {
    public static void main(String[] args) {
        var tekst = new Teksty(new String[]{"Ala","ma","kota"});
        StringsIterator iterator = tekst.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
