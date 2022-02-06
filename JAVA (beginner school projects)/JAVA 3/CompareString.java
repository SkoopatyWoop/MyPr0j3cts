import java.util.*;
public class CompareString
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
      int i;
      for( i=1; i<=5;i++)
      {
         System.out.print("What is your password ");
         String name = console.next();
         if (name.equals("Xyz123"))
         {
         System.out.println("Your password is correct");
         //System.out.println("We're a happy family!");
         break;
         }
         else
         System.out.println("Your password is incorrect");
      }   
      if(i==6)
      System.out.println("all your attempts are over, please, try sometime later");
   }
 }     