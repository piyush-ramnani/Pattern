import java.util.*;

class InversePyramidTwo{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Height: ");

        int h = s.nextInt();

        //Outer loop (Rows)
        for (int i=0; i<=h-1; i++){
            
            //inner loop for columns (to print " ")
            for(int j=1; j<=h-i; j++){
                System.out.print(" ");
            }
            //inner loop for columns (to print "*")
            for (int j=h-i; j<=h; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}