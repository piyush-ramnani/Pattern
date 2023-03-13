import java.util.*;
public class Utkarsh{
public static void main(String[] args) {
    
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Rows:");
    
    int r = sc.nextInt();
    
    System.out.println("Columns:");
    int c = sc.nextInt();
    
    for(int i =1; i <= r; i++){
        if(i==1 || i ==r){
            for(int j =1; j<=c; j++){
    
                System.out.print("*");
            }
            System.out.println();
        }else{
            for(int k=1; k<=c; k++){
    
                if(k==1 || k==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
    
            }
            System.out.println();
        }   
    
    }
}

}



}
