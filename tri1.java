// package pattern;

import java.util.Scanner;

import javax.xml.transform.Source;

class tri1{
    public static void main(String[] args) {

        int rows = 5;

        // Loop through the rows
        for (int i = 0; i < rows; i++) {

            // Loop through the columns
            for (int j = 0; j < rows; j++) {

                // Print a "*" if the current row and column are equal
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Print a newline character to move to the next row
            System.out.println();
        }



        // System.out.println("I am inside the program");
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        // int i=1;
        // while(i<=n)
        // {
        //     int j=1;
        //     while(j<=i)
        //     {
        //         System.out.println(i-j+1+" ");
        //         j++;
        //     }
        //     System.out.println("\n");
        //     i++;
        // }
    }
}