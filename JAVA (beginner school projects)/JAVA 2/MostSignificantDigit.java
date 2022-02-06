import java.util.*;
public class MostSignificantDigit
{
   public static void main(String[] args)
   {
   Scanner c=new Scanner(System.in);
   System.out.println("enter a number");
   int num=c.nextInt();
   int mostsig=MSB(num);
   System.out.println("The Most Significant digit is "+mostsig);
   }


   public static int MSB(int n)
   {
      n = Math.abs(n); 
      int lastdigit;          // handle negativesint sum = 0;
      while (n >= 10) 
      {
         n = n / 10;            
// remove last digit
      }
      
         return n;
    }
}