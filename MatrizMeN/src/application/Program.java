package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nL = sc.nextInt();
        int nC = sc.nextInt();

        int [][] mat = new int[nL][nC];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int nFind = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == nFind){
                    System.out.println("Position: " +i+ ", " +j);
                    //esquerda
                    if ( j-1 >= 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    //direita
                    if ( j+1 < mat[i].length){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    //acima
                    if ( i-1 >= 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    //abaixo
                    if ( i+1 < mat.length){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }

        }


        System.out.println();
        sc.close();
    }
}
