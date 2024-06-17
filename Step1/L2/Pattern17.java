package Step1.L2;

import java.util.Scanner;

/* 
Pattern 17
0    A       [3, 1, 0]
1   ABA      [2, 2, 1]
2  ABCBA     [1, 3, 2]
3 ABCDCBA    [0, 4, 3]
Space = rows-1-i
char1 = i+1
char2 = i
*/

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0,j; i < rows; i++){
            
            char alphabet = 'A';
            // Space -> rows-1-i
            for(j = rows-1-i; j > 0; j--)
                System.out.print(" ");
            
            // Char 1 -> From 1 to i+1
            for(j = 1; j <= i+1; j++){
                System.out.print(alphabet);
                alphabet++;
            }

            alphabet--;
            // Char 2 -> From 0 to i
            for(j = i; j > 0; j--){
                alphabet--;
                System.out.print(alphabet);
            }
            System.out.println();
        }
        sc.close();
    }
}
