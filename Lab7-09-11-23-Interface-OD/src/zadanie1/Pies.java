package zadanie1;

public class Pies extends Zwierz implements Moveable, Speakable{

    public Pies(String imie) {
        super(imie);
    }

    @Override
    public void start() {
        System.out.println("Pies biegnie");
    }

    @Override
    public void stop() {
        System.out.println("Pies zatrzymuje sie");
    }

    @Override
    public String getVoice(int voice) {
        switch(voice){
            case Speakable.quiet: return "hau hau";
            case Speakable.loud: return "Hau Hau";
            default: return "Niezidentyfikowano";
        }
    }

    @Override
    String getTyp() {
        return "Pies";
    }
}
