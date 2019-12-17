import java.util.*;
public class ReadSentinelDoWhile
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
      int sum = 0,number =0;
      // pull one prompt/read ("post") out of the loop
      do
      {
      sum = sum + number;
      System.out.print("Enter a number (-1 to quit): ");
      number = console.nextInt();
                // moved to top of loop
       }while (number!=-1);
      System.out.println("The total is " + sum);
   }
 }