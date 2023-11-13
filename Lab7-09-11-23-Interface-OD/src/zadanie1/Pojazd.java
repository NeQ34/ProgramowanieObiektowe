package zadanie1;

public class Pojazd implements Moveable{
    @Override
    public void start() {
        System.out.println("Pojazd rusza");
    }

    @Override
    public void stop() {
        System.out.println("Pojazd zatrzymuje sie");
    }
}
