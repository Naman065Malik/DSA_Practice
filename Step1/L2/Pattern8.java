package Step1.L2;

import java.util.Scanner;

/* 

Pattern 8 (Important)
0  *****      [0, 5]
1   ***       [1, 3]
2    *        [2, 1]
Formulae: Space -> i; Star -> (rows-1) * 2 - 1
Here, Number of rows is 3

*/

public class Pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0, j; i < rows; i++){

            // For Space: i
            for (j = 0; j < i; j++)
                System.out.print(" ");

            // For Star: (rows-i)*2 - 1
            for(j = (rows-i)*2 - 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
