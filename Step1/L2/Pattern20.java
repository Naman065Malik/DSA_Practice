package Step1.L2;

import java.util.Scanner;

/* 
Pattern 20
0 *    *    [1, 4, 1]   Part A ->
1 **  **    [2, 2, 2]       Star -> i + 1
2 ******    [3, 0, 3]       Space -> (rows - 1 - i) * 2
0 **  **    [2, 2, 2]       Star -> i + 1
1 *    *    [1, 4, 1]   Part B ->
                            Star -> rows - 1 - i
                            Space -> (i + 1) * 2
                            Star -> rows - 1 - i
*/

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0,j; i < rows; i++){
            for(j = i + 1; j > 0; j--)
                System.out.print("*");

            for(j = (rows - 1 - i) * 2; j > 0; j--)
                System.out.print(" ");
            
            for(j = i + 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }

        for(int i = 0,j; i < rows - 1; i++){

            for(j = rows - 1 - i; j > 0; j--)
                System.out.print("*");

            for(j = 2*(i + 1); j > 0; j--)
                System.out.print(" ");

            for(j = rows - 1 - i; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
