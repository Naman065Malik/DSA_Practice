package Step1.L2;

import java.util.Scanner;

// Pattern 4
// 1
// 22
// 333
// Here, Number of rows is 3

public class Pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter number of rows:");
        rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

        sc.close();
    }
}
