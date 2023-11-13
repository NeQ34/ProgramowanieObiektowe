package zadanie5;

public class Pojazdy{
    private Pojazd[] pojazdy;

    public Pojazdy(Pojazd[] p) {
        this.pojazdy = p;
    }

    public void wyswietlInfo(){
        for(Pojazd p : pojazdy){
            System.out.println(p.toString());
        }
    }
}
