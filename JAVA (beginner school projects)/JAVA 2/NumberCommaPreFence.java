import java.util.*;
public class NumberCommaPreFence
{
   public static void main(String []args)
   {
      Scanner c=new Scanner (System.in);
      System.out.println("enter the number");
      int num=c.nextInt();
      int i=1;
      System.out.print(i);
      i++;
      while(i<=num)
      {
         
         System.out.print(", "+i);
         i++;
         
      }
      
    }
 }        