package Step1.L2;

import java.util.Scanner;

/*
Pattern 12
0 1      1   [1, 6, 1]
1 12    21   [2, 4, 2]
2 123  321   [3, 2, 3]
3 12344321   [4, 0, 4]
num1 = i+1
space = (row-1-i)*2
num2 = Reverse(i+1)
Here, Number of rows is 4
*/

public class Pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0,j; i < rows; i++){

            // Num1 -> from 1 to i+1
            for(j = 1; j <= i+1; j++)
                System.out.print(j);

            // Space -> (rows-1-i)*2
            for(j = (rows-1-i)*2; j > 0; j--)
                System.out.print(" ");

            // Num2 -> from i+1 to 1
            for(j = i+1; j > 0; j--)
                System.out.print(j);

            System.out.println();
        }
        sc.close();
    }
}
