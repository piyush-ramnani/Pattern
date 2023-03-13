import java.util.Scanner;

class Pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        for(int j=1; j<=r; j++){
            for(int i=1; i<=c; i++){
            System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}