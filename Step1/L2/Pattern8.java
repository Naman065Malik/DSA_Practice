package Step1.L2;

import java.util.Scanner;

// Pattern 8
// *******
//  *****
//   ***
//    *
// Here, Number of rows is 3

public class Pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0, j; i < rows; i++){
            for (j = 0; j < i; j++)
                System.out.print(" ");
            for(j = (rows-i)*2 - 1; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

        sc.close();
    }
}
