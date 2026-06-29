import java.util.*;
public class pattern3{
    public static void main(String[]args){
        Scanner sm=new Scanner(System.in);
        int n=sm.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int x=1;
            for(int k=0;k<=i;k++){
                System.out.print(x+" ");
                x=x*(i-k)/(k+1);
            }
            System.out.println();
        }
    }
}