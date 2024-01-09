package zad9;

public class StringBuilderService {
    public String joinStrings(String... s){
        StringBuilder sb = new StringBuilder();
        for(String n : s){
            sb.append(n+", ");
        }
        return sb.toString();
    }
    public String joinStrings2(String... s){
        String napis = String.join(", ",s);
        return napis;
    }
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public String concatenateStrings(String[] tab1,String[] tab2){
        StringBuilder sb = new StringBuilder();
        for(String s1 : tab1){
            sb.append(s1+" ");
        }
        for(String s2 : tab2){
            sb.append(s2+" ");
        }
        return sb.toString();
    }
    public String removeDuplicates(String s){
        StringBuilder sb = new StringBuilder();
        char[] tab = s.toCharArray();
        for(int i=0; i<tab.length; i++){
            boolean duplicate = true;
            for(int j=0; j<i; j++){
                if(tab[i] == tab[j]){
                    duplicate = false;
                    break;
                }
            }
            if(duplicate) sb.append(tab[i]);
        }
        return sb.toString();
    }
}
