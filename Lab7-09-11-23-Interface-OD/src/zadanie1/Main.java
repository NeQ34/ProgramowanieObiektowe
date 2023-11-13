package zadanie1;

public class Main {
    public static void main(String[] args) {
        Pies p = new Pies("Azor");
        Auto a = new Auto("Renault");

        wyscig(p,a);
        koniecWyscigu(p,a);

    }
    public static void wyscig(Moveable... moveables){
        for(Moveable m : moveables){
            m.start();
        }
    }
    public static void koniecWyscigu(Moveable... moveables){
        for(Moveable m : moveables){
            m.stop();
        }
    }
}
