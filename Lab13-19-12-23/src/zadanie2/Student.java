package zadanie2;

public class Student extends Osoba{
    private int nrIndeksu;

    public Student(String pesel, String imie, String nazwisko, int nrIndeksu) {
        super(pesel, imie, nazwisko);
        this.nrIndeksu = nrIndeksu;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }
}
