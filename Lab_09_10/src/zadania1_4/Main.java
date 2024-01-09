package zadania1_4;

public class Main {
    public static void main(String[] args) {
        String[] s = {"Sample text", "Sample text", "Sample text", "Sample text", "aaaa", "aaa"};
        String sampleText = "Ala ma kota a kot ma Ale";
        System.out.println(z1sprawdz("Jan","Kowalski","programista",20));
        System.out.println(z2sprawdz(s,"Sa"));
        System.out.println(z3sprawdz(s,"xt"));
        System.out.println(z4FragmentTekstu(sampleText,4,8));
        System.out.println(z4FragmentTekstu(sampleText,0,0));
    }
    //zad1
    public static boolean z1sprawdz(String imie,String nazwisko,String zawod, int maxSzerokosc){
        System.out.println(imie.length());
        return imie.length()>maxSzerokosc || nazwisko.length()>maxSzerokosc || zawod.length()>maxSzerokosc;
    }
    //zad2
    public static int z2sprawdz(String[] tab,String prefix){
        int ile=0;
        for(String s : tab){
            if(s.startsWith(prefix)) ile++;
        }
        return ile;
    }
    //zad3
    public static int z3sprawdz(String[] tab,String sufix){
        int ile=0;
        for(String s : tab){
            if(s.endsWith(sufix)) ile++;
        }
        return ile;
    }
    //zad4
    public static String z4FragmentTekstu(String text, int p,int k) {
        if (p < 1 || k < 1) return null;
        else {
            String kopiaTextu = text;
            String wycietyFragment = text.substring(p, k);
            return "Tekst oryginalny: " + kopiaTextu + ", zakres wycinania: " + p + "," + k + ", wynik" +
                    "\nwycinania:" + wycietyFragment + ", długość wyciętego ciągu: " + wycietyFragment.length();
        }
    }
}
