package Step1.L2;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;

        System.out.print("Please Enter the number of rows:");
        rows = sc.nextInt();

        for(int i = 0; i < rows; i++){
            char alphabet = 'A';
            for(int j = rows-i; j > 0; j--,alphabet++)
                System.out.print(alphabet);
            System.out.println();
        }
        sc.close();
    }
}
