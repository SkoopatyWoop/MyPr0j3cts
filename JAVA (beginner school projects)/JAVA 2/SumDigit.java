import java.util.*;
public class SumDigit
{
   public static void main(String[] args)
   {
   Scanner c=new Scanner(System.in);
   System.out.println("enter a number");
   int num=c.nextInt();
   int sum=digitSum(num);
   System.out.println("The sum of the digits is"+sum);
   }


   public static int digitSum(int n)
   {
      int sum=0;
      n = Math.abs(n);           // handle negativesint sum = 0;
      while (n > 0) 
      {
         sum = sum + (n % 10);  // add last 
         n = n / 10;            
// remove last digit
      }
         return sum;
    }
}