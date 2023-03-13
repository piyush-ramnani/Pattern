package AdvancedPatterns;
import java.util.*;

public class StarButterfly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        int h = s.nextInt();

        for(int i=1; i<=h; i++){
            for(int j=1; j<=h; j++){
                if(j<=i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=h; j<2*h; j++){
                if(j<2*h-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int k=h; k<2*h; k++){
            for(int j=1; j<=h; j++){
                if(j<=2*h-k){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=h; j<2*h; j++){
                if(j<k){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
