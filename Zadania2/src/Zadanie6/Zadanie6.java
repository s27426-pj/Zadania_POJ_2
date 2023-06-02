package Zadanie6;

public class Zadanie6 {
    public static void main(String[] args) {
        int a,b,c;
        int[][] tabl = new int[3][3];
        tabl[0][0] = 4;
        tabl[0][1] = 7;
        tabl[0][2] = 5;
        tabl[1][0] = 9;
        tabl[1][1] = 1;
        tabl[1][2] = 2;
        tabl[2][0] = 6;
        tabl[2][1] = 3;
        tabl[2][2] = 4;
        for (int i=0;i<3;i++) {
            System.out.println(tabl[i][0] + " " + tabl[i][1] + " " + tabl[i][2]);
        }
        System.out.println(" ");
        System.out.println(" ");
        a = tabl[0][0];
        b = tabl[0][1];
        c = tabl[0][2];
        for (int i=0;i<2;i++) {
            tabl[i][0] = tabl[i+1][0];
            tabl[i][0] = tabl[i+1][0];
            tabl[i][0] = tabl[i+1][0];
            tabl[i][1] = tabl[i+1][1];
            tabl[i][1] = tabl[i+1][1];
            tabl[i][1] = tabl[i+1][1];
            tabl[i][2] = tabl[i+1][2];
            tabl[i][2] = tabl[i+1][2];
            tabl[i][2] = tabl[i+1][2];
        }
        tabl[2][0] = a;
        tabl[2][1] = b;
        tabl[2][2] = c;

        for (int i=0;i<3;i++) {
            System.out.println(tabl[i][0] + " " + tabl[i][1] + " " + tabl[i][2]);
        }
    }}
