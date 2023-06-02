package Zadanie7;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        int r, h;
        Double V,Pi;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj promień walca:");
        r = keyboard.nextInt();
        System.out.println("Podaj wysokość walca:");
        h = keyboard.nextInt();
        Pi = 3.14;
        V = Pi*r*r*h;
        System.out.println("Pojemność walca wynosi : " + V );
    }
}