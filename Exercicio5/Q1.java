

import java.util.Scanner;
public class Q1{
    public void q1(Scanner sc){
        int[][] matriz = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("a");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}