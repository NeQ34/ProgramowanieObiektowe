package zadanie2;

public class TestFigur {
    public static void main(String[] args) {
        Figura[] figury = new Figura[3];
        figury[0] = new Trojkat();
        figury[1] = new Kwadrat();
        figury[2] = new Prostokat();

        rysujFigury(figury);
    }
    public static void rysujFigury(Figura[] figury){
        for(Figura f : figury){
            f.rysuj();
        }
    }
}
