package zadanie1;

public interface Speakable {
    int quiet = 0;
    int loud = 1;
    abstract String getVoice(int voice);
}
