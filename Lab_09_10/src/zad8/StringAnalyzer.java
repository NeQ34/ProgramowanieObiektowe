package zad8;

public class StringAnalyzer {

    public void analyzeString(String s){
        String[] tab = s.split(",");
        int suma=0;
        int najwieksza=0;
        int najmniejsza= Integer.parseInt(tab[0]);
        for(int i=0; i<tab.length; i++){
            suma+=Integer.parseInt(tab[i]);
            if(Integer.parseInt(tab[i])>najwieksza) najwieksza = Integer.parseInt(tab[i]);
            if(Integer.parseInt(tab[i])<najmniejsza) najmniejsza = Integer.parseInt(tab[i]);
        }
        System.out.println("Suma: "+suma);
        System.out.println("Srednia: "+suma/tab.length);
        System.out.println("Najwieksza: "+najwieksza);
        System.out.println("Najmniejsza: "+najmniejsza);
    }
}
