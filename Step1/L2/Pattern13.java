package Step1.L2;

import java.util.Scanner;

/* 
Pattern 13
0  1 
1  2 3
2  4 5 6
*/

public class Pattern13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0,num = 1; i < rows; i++){
            for(int j = 0; j < i + 1; j++, num++)
                System.out.printf("%d ",num);
            System.out.println();
        }
        sc.close();
    }
}
