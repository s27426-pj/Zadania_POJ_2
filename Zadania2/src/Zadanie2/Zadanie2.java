package Zadanie2;
import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
    String a,b,c,d;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj imie:");
        a = keyboard.next();
        System.out.println("Podaj nazwisko:");
        b = keyboard.next();
        System.out.println("Podaj grupe:");
        c = keyboard.next();
        System.out.println("Podaj kierunek studiow:");
        d = keyboard.next();
        System.out.println(" ");
        System.out.println("Imie:" + a);
        System.out.println("Nazwisko:" + b);
        System.out.println("Grupa:" + c);
        System.out.println("Kierunek studiow:" + d);

    }
}