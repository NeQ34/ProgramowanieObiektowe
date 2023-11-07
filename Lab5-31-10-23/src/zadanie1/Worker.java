package zadanie1;

import java.time.LocalDate;

public abstract class Worker {
    private String imie;
    private String nazwisko;
    private String pesel;
    private int rokUrodzenia;
    private int rokZatrudnienia;
    private Plec plec;
    private String company;
    private String occupation; //zawod

    public Worker(){}

    public Worker(String imie, String nazwisko, String pesel, int rokUrodzenia, int rokZatrudnienia, Plec plec, String company, String occupation) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.rokUrodzenia = rokUrodzenia;
        this.rokZatrudnienia = rokZatrudnienia;
        this.plec = plec;
        this.company = company;
        this.occupation = occupation;
    }

    public abstract double calculatePayment();
    public void displaySalaryInformation(){
        System.out.println("imie: " + imie);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("pensja: " + calculatePayment());
    }

    @Override
    public String toString() {
        return "imie: "+imie +
                "\nnazwisko: "+nazwisko+
                "\npesel: "+pesel+
                "\nrokUrodzenia: "+rokUrodzenia+
                "\nrokZatrudnienia: "+rokZatrudnienia+
                "\nplec: "+plec+
                "\ncompany: "+company+
                "\noccupation: "+occupation;
    }

    public int getAge(){
        return LocalDate.now().getYear()-rokUrodzenia;
    }

    public int calculateJobSeniority(){
        return LocalDate.now().getYear()-rokZatrudnienia;
    }

    public int calculateTimeToRetirement(){
        if(plec == Plec.M && getAge()<65) return 65-getAge();
        else if(plec == Plec.K && getAge()<60) return 60-getAge();
        else return 0;
    }

    public void display(){
        System.out.println(this);
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    public int getRokUrodzenia() {
        return rokUrodzenia;
    }
    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }
    public int getRokZatrudnienia() {
        return rokZatrudnienia;
    }
    public void setRokZatrudnienia(int rokZatrudnienia) {
        this.rokZatrudnienia = rokZatrudnienia;
    }
    public Plec getPlec() {
        return plec;
    }
    public void setPlec(Plec plec) {
        this.plec = plec;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
