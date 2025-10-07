package sor1;
import java.util.Scanner;
public class One {
    static int sum(int a, int b) // O(c)
    {
        int c = a + b; // 1 op
        return c; // 1 op

        // O(1 + 1)
        // O ( 2)
        // O( 1 * C) // elimate the constants
        // O( 1 )
    }



    static void linearTime(int n) // n = 100000
    {
        int a = n * n; // 1op
        n = n + 12;  // 1 op 
        for (int i = n; i >= 1; i = i / 2) // log n + 1
        {
            System.out.println(i); // n true times   
        }

        // O( 1 + 1 + logN + 1)
        // O( 3 + logN )
        // O( c + LogN )
        // O( logN )   -> Log time TC   
        
    }

    public static void main(String[] args) {
        logn_1(3);
        logn_1(2);
        logn_1(20);
    }
}
