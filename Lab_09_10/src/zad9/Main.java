package zad9;

public class Main {
    public static void main(String[] args) {
        StringBuilderService sb = new StringBuilderService();
        String napis = sb.joinStrings("Ala","ma","kota");
        System.out.println(napis);

        String napis2 = sb.joinStrings2("Ala","ma","kota","2");
        System.out.println(napis2);

        String napis3 = sb.reverseString("Walter");
        System.out.println(napis3);

        String[] tab1 = {"Ala","kota","kot","ale"+"XDDASASA","KSJDSHDHS"};
        String[] tab2 = {"ma","a","ma","XD"};

        String concat = sb.concatenateStrings(tab1,tab2);
        System.out.println(concat);

        String duplicates = sb.removeDuplicates("Ala ma kota");
        System.out.println(duplicates);
    }
}
