package zad10;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        long time0 = System.currentTimeMillis();
        System.out.println(konkatenacjaString(n));
        System.out.println("String: "+(System.currentTimeMillis()-time0)+"ms");
        long time1 = System.currentTimeMillis();
        System.out.println(konkatenacjaStringBuffer(n));
        System.out.println("StringBuffer: "+(System.currentTimeMillis()-time1)+"ms");
        long time2 = System.currentTimeMillis();
        System.out.println(konkatenacjaStringBuilder(n));
        System.out.println("StringBuilder: "+(System.currentTimeMillis()-time2)+"ms");
    }
    public static String konkatenacjaString(int n){
        String s = "";
        for(int i=0; i<=n; i++){
            s+=i+" ";
        }
        return s;
    }
    public static String konkatenacjaStringBuffer(int n){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<=n; i++){
            sb.append(i+" ");
        }
        return sb.toString();
    }
    public static String konkatenacjaStringBuilder(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=n; i++) sb.append(i+" ");
        return sb.toString();
    }
}
