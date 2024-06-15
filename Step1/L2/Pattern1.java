package Step1.L2;

import java.util.Scanner;

// Class to print the pattern 1
// *****
// *****
// *****
// *****
// *****
// Here, the number of rows is 5
// The number of columns is 5

public class Pattern1 {
    public static void main(String args[]) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Rows You Want To Print:");
        rows = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
