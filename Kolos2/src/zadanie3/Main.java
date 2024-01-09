package zadanie3;

public class Main {
    public static void main(String[] args) {
        wyswietlTekst("Ala ma kota a kot ma Ale",'a','b');
        String[] words = {"prefixWord","prefixWord","Otherprefix"};
        System.out.println(sprawdzPrefix(words,"prefix"));
    }
    public static void wyswietlTekst(String text,char target,char replacement){
        String modifiedText = text.replace(target,replacement);
        System.out.println(modifiedText);
    }
    public static boolean sprawdzPrefix(String[] words, String prefix){
        int count = 0;
        for(String s : words){
            if(s.startsWith(prefix)) count++;
        }
        return count>=2;
    }
}
