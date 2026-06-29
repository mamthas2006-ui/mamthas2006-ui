import java.util.*;
public class pattern2{
    public static void main(String[]args){
        Scanner sm=new Scanner(System.in);
        int n=sm.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*(i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}