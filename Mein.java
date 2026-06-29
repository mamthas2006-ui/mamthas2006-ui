import java.util.*;
 public class Mein{
    public static void main(String[]args){
        Scanner sol=new Scanner(System.in);
      String s=sol.nextLine();
        Stack<Character>stack=new Stack<>();
        for(Char ch:s.toCharArray(){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='['){
            stack.push(']');
            }
            else if('{'){
                stack.push('}');
            }
            else {
                if{
                    (stack.isEmpty()||stack.pop!=0){
                    System.out.println("false";)
                    }
                    return ;
                }
            }
        }
        System.out.println(stack.isEmpty);
    }
 }