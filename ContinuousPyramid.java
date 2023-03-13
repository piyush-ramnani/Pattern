import java.util.*;

public class ContinuousPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        int h = s.nextInt();
        int num = 1;

        for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                    System.out.print(num);
                    num++;
                }
                System.out.println();
        }
    }
}
