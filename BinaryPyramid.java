import java.util.*;

public class BinaryPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");
        int h = s.nextInt();

        for(int i=1; i<=h; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;                  //Odd or Even position
                if(sum%2==0){
                    System.out.print("1 ");     // Even check
                }
                else{
                    System.out.print("0 ");     // Odd check
                }
            }
            System.out.println();
        }
    }
}
