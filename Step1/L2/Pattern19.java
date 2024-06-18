package Step1.L2;

import java.util.Scanner;

/* 
Pattern 19
0 ********  [4, 0, 4]        Part A ->
1 ***  ***  [3, 2, 3]           Star -> rows - i
2 **    **  [2, 4, 2]           Space -> i * 2
3 *      *  [1, 6, 1]           Star -> rows - i
0 *      *  [1, 6, 1]        Part B ->
1 **    **  [2, 4, 2]           Star -> i + 1
2 ***  ***  [3, 2, 3]           Space -> (rows-1-i) * 2
3 ********  [4, 0, 4]           Star -> i + 1
Part A ->
    Star -> rows - i
    Space -> i * 2
    Star -> row - i
*/

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        // Part A
        for(int i = 0,j; i < rows; i++){
            
            // Star
            for(j = rows-i; j>0; j--)
                System.out.print("*");

            //Space
            for(j = 0; j < i*2; j++)
                System.out.print(" ");

            // Star
            for(j = rows-i; j>0; j--)
                System.out.print("*");

            System.out.println();
        }

        // Part B
        for(int i = 0,j; i < rows; i++){

            for(j = i + 1; j>0; j--)
                System.out.print("*");
            
            for(j = (rows-1-i)*2; j>0; j--)
                System.out.print(" ");

            for(j = i + 1; j>0; j--)
                System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
