import java.util.*;

public class FullNumberPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Height: ");

        int h = s.nextInt();

        for(int i=1; i<=h; i++){
            for(int j=h; j>i; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }  
            System.out.println();
        }

    }
}
