/*

PRINT THE BELOW PATTERN
*
   **
  ***
 ****
*****

 */

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        System.out.print("Height: ");

        int a = s.nextInt();

        if(a>100){
            System.out.println("T00 big to handle!");
        }
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }  
}
