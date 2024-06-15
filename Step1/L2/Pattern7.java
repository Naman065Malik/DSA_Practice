package Step1.L2;

import java.util.Scanner;

// Pattern 7 (Important)
//    *
//   ***
//  *****
// *******
// Here, Number of rows is 4
public class Pattern7 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();
        for(int i = rows, j; i > 0; i--,rows++){
            // System.out.printf("Rows: %d, i: %d", rows, i);
            for(j = 0; j < i -1; j++){
                System.out.print(" ");
            }
            for(j = rows+1-i; j > 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
