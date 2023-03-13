import java.util.*;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Height");
        int h = s.nextInt();
        int[] Arr = new int[h];

        for (int i=1; i<=h; i++){
            for(int j=1; j<=h; j++){
                Arr [j] = j;
            }
        }
    }
}
