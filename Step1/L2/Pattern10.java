package Step1.L2;

import java.util.Scanner;

/* 
Pattern 10
0 *    [1]
1 **   [2]
2 ***  [3]
0 **   [2]
1 *    [1]
*/

public class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max;
    
        System.out.print("Please Enter maximum Frequency for the Pattern:");
        max = sc.nextInt();

        // Part A of Pattern
        for(int i = 0; i < max; i++){
            for(int j = i+1; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

        // Part B of Pattern
        for(int i = 0; i < max-1; i++){
            for(int j = max-1-i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
