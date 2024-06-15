package Step1.L2;

import java.util.Scanner;

// Pattern 5
// ***
// **
// *
// Here, Number of rows is 3

public class Pattern5 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;
    
        System.out.print("Please Enter number of rows:");
        rows = sc.nextInt();

        for(int i = rows; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
