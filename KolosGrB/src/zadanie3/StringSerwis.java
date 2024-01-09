package zadanie3;

public class StringSerwis {
    public static void main(String[] args) {
        wyswietlTekst("Ala ma kota",'z');
        System.out.println(sprawdzSufix(new String[]{"SampleSufix","SampleSufix","SampleSufix"},"Sufix"));
    }

    public static void wyswietlTekst(String text, char znak){
        String nowyText="";
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='a') nowyText+=znak;
            else nowyText+=text.charAt(i);
        }
        System.out.println(nowyText);
    }
    public static boolean sprawdzSufix(String[] text, String sufix){
        int sufixCount=0;
        for(String s:text){
            if(s.endsWith(sufix)) sufixCount++;
        }
        return sufixCount>=3;
    }
}
