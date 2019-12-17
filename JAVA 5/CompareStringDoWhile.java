import java.util.*;
public class CompareStringDoWhile
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
      //int i;
      //for( i=1; i<=5;i++)
      String name;
      do
      {
         System.out.print("What is your password ");
         name = console.next();
         
       }while(!name.equals("Xyz123"));
         
   }
 }     