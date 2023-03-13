import java.util.*;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        int h = s.nextInt();

        for(int i=0; i<h; i++){
            for(int j=1; j<=h-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
