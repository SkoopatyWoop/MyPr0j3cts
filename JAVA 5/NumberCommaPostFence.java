import java.util.*;
public class NumberCommaPostFence
{
   public static void main(String []args)
   {
      Scanner c=new Scanner (System.in);
      System.out.println("enter the number");
      int num=c.nextInt();
      int i=1;
      while(i<num)
      {
         System.out.print(i+", ");
         i++;
      }
      System.out.print(i);
    }
 }        