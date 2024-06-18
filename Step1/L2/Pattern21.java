package Step1.L2;

import java.util.Scanner;

/* 
Pattern 21
0 ****  [1, 0, 1] 
1 *  *  [1, 2, 1]
2 *  *  [1, 2, 1]
3 ****  [1, 0, 1]
Star -> 1
Space/Star -> rows-2 if its first or last iteration
Star -> 1
*/

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("PLease Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                if( i == 0 || j == 0 || i == rows-1 || j == rows-1)
                    System.out.print("*");
                else    
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
