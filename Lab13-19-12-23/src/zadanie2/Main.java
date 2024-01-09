package zadanie2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Osoba s1 = new Osoba("938475849399","Jan","Kowalski");
        Osoba s2 = new Osoba("857475938576","Ola","Aowak");
        Osoba s3 = new Osoba("636575404858","Walter","BWhite");

        Osoba[] osoby = new Osoba[]{s1,s2,s3};

        for(Osoba s:osoby){
            System.out.println(s.toString());
        }

        class KlasaWew implements Comparator<Osoba>{
            @Override
            public int compare(Osoba o1, Osoba o2) {
                int c = o1.getNazwisko().compareTo(o2.getNazwisko());
                if(c==0) c = o1.getImie().compareTo(o2.getImie());
                return c;
            }
        }
        //a:
        Arrays.sort(osoby,new KlasaWew());
        System.out.println("posortowana wg nazwiska:");
        for(Osoba s:osoby){
            System.out.println(s.toString());
        }
        //b:
        Arrays.sort(osoby, new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                return o1.getPesel().compareTo(o2.getPesel());
            }
        });
        System.out.println("Sortowanie wg peseli:==============");
        for(Osoba s:osoby){
            System.out.println(s.toString());
        }
        //c:
        Student st1 = new Student("058463","Jesse","Pinkman",4);
        Student st2 = new Student("746385","Skyler","White",2);
        Student st3 = new Student("948365","Ola","Nowak",6);
        Student[] studenci = {st1,st2,st3};

        Arrays.sort(studenci, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getNrIndeksu()==o2.getNrIndeksu()) return 0;
                else if(o1.getNrIndeksu()>o2.getNrIndeksu()) return 1;
                else return -1;
            }
        });
        System.out.println("Posortowani studenci wg indeksu:");
        for(Student st: studenci){
            System.out.println(st.toString());
        }
    }
}
