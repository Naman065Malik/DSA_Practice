package Step1.L2;

import java.util.Scanner;

/*
Pattern 11
1 
0 1 
1 0 1 
Outer Loop -> Iterate from 0 - rows
Inner Loop -> Iterate from 0 - i+1 
Initial num = i % 2
then toggle num from 0-1 using XOR Operator ^ (num ^ 1)
Here, Number of rows is 3
*/

public class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 1,num; i <= rows; i++){
            num = i % 2;
            for(int j = 0; j < i; j++){
                System.out.printf("%d ", num);
                num = num ^ 1; // XOR of num 
            }
            System.out.println();
        }
        sc.close();
    }
}
