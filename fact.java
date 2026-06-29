import java.util.*;
public class fact{
    public class static void main(String[]args){
        Scanner sol=new Scanner(System.in);
        int n=sol.nextInt();
        int fact=1;
        if(n==0){
            System.out.println("1");
        }
        else if(n<0){
            System.out.println("invalid input");
        }
        else{
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }

            System.out.println(fact);
        }
    }
}