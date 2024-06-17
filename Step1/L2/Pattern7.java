package Step1.L2;

import java.util.Scanner;

/* 

Pattern 7 (Important)
0    *       [3, 1]
1   ***      [2, 3]
2  *****     [1, 5]
3 *******    [0, 7]
Formulae: Space -> row-1-i ; Star -> i*2 + 1
Here, Number of rows is 4

*/
public class Pattern7 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();
        for(int i = 0,j; i < rows; i++){

            // For Space: rows-1-i
            for(j = rows-1-i; j >= 0; j--)
                System.out.print(" ");

            // For Star: i*2 + 1
            for(j = i*2 + 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
            
        }

        sc.close();

    }
}
