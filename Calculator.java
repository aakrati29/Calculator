import java.util.*;
public class Calculator{
  public static void multiplication(int a, int b){
        System.out.println(a*b);
      }
  
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
       int a  = s.nextInt();
       int b = s.nextInt();
       addition(a,b);
       substraction(a,b);
       multiplication(a,b);
       division(a,b);
       
 }
}