import java.util.*;

public class InversePyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Height: ");

        int h = sc.nextInt();

        for(int i=1;i<=h;i++){
            for(int j=h; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}