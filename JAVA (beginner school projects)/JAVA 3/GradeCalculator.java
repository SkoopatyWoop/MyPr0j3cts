import java.util.*;
public class GradeCalculator
{
   public static void main(String [] args)
   { 
      Scanner console = new Scanner(System.in);
      System.out.print("What percentage did you earn? ");
      int percent = console.nextInt();
      if (percent >= 90) 
      {
         System.out.println("You got an A!");
      }
      else if (percent >= 80) 
      {
         System.out.println("You got a B!");
      }
      else if (percent >= 70)
       { 
          System.out.println("You got a C!");
       }
       else if (percent >= 60) 
       {
          System.out.println("You got a D!");
       }
      else
      {
         System.out.println("You got an F!");
      }
   }
}      