package Step1.L2;

import java.util.Scanner;

/* 
Pattern 9 (Combination of Pattern 7 and Pattern 8)
0    *        [2, 1]
1   ***       [1, 3]
2  *****      [0, 5]
0  *****      [0, 5]
1   ***       [1, 3]
2    *        [2, 1]
// Here, Number of rows is 3
*/

public class Pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        // Part A of Pattern
        for(int i = 0,j; i < rows; i++){

            // For Space: rows-1-i
            for(j = rows-1-i; j > 0; j--)
                System.out.print(" ");

            // For Star: i*2 + 1
            for(j = i*2 + 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }

        // Part B of Pattern
        for(int i = 0,j; i < rows; i++){
            // System.out.printf("i: %d", i);
            // For Space: i
            for(j = i; j > 0; j--)
                System.out.print(" ");
            
            // For Star: (rows-1) * 2 - 1
            for(j = (rows-i)*2-1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
