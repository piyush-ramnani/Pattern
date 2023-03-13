/*

PRINT THE BELOW PATTERN
    *
   **
  ***
 ****
*****

 */



import java.util.*;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Height: ");
        int h = s.nextInt();

        for(int i=0; i<h; i++){
            for(int j=1; j<=h; j++){
                if (j>=h-i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
