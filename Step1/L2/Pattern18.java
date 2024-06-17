package Step1.L2;

import java.util.Scanner;

/* 
Pattern 18
0 C
1 B C
2 A B C
Outer loop
Initial State alphabet = A + rows-1
Inner loop = alphabet - i
*/

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            char alphabet = 'A';
            alphabet += rows-1;
            alphabet -= i;
            for(int j = 0; j <= i; j++){
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
        sc.close();
    }
}
