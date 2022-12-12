
import java.util.*;
/**
 *
 * @author thebasilugo
 */
public class Array2D {
    public static void main(String[] args) {
        int [][] table = new int[3][4];
       int i,j;    
        Scanner in = new Scanner(System.in);
         System.out.println("Enter values for array ");
        for ( i=0;i<3;i++){
            for( j=0;j<4;j++){    
                 table[i][j] = in.nextInt();
                 
                 
            }
        }
           System.out.print("\n");
        for ( i=0;i<=2;i++){
            for( j=0;j<4;j++){
                System.out.println(" " + table[i][j] + " ");      
}
            
        }
        System.out.print("\n");
    }}
