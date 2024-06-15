package Step1.L2;

import java.util.Scanner;

// Pattern 2
// *
// **
// ***
// Here, Number of Rows is 3

public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter Number of Rows:");

        rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
