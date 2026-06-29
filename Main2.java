import java.util.*;
public class Main2
{
    public static void main(String[]args)
    {
        Scanner sol= new Scanner(System.in);
        String s=sol.nextLine();
        int n= s.length();
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++){
            if(j==i||j==n-i-1)
                {
                System.out.print(s.charAt(i));
            }
            else{
                System.out.print(" ");
              }
            }
             System.out.println();
        }
           
    }
}


