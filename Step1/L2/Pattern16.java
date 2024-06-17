package Step1.L2;

import java.util.Scanner;

/* 
Pattern 16
0 A
1 BB
2 CCC
3 DDDD
*/

public class Pattern16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        char alphabet = 'A';
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i + 1; j++)
                System.out.print(alphabet);
            alphabet++;
            System.out.println();
        }
        sc.close();
    }
}
