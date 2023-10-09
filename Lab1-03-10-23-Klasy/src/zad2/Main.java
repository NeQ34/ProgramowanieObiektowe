package zad2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m,n;
        do{
            System.out.print("Podaj szerokość: ");m = s.nextInt();
            System.out.print("Podaj wysokość: ");n = s.nextInt();
        }while(m<0||n<0);

        int[][] tab = new int[m][n];

        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.print("Podaj element ["+i+"]["+j+"]"); tab[i][j] = s.nextInt();
            }
        }
        wyswietlTablice(tab);
        System.out.println("Srednia: "+obliczSrednia(tab));
    }
    public static void wyswietlTablice(int[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static double obliczSrednia(int[][] tab){
        double suma=0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                suma+=tab[i][j];
            }
        }
        return suma/(tab.length*tab[0].length);
    }
}
