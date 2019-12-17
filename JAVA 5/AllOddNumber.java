import java.util.*;
public class AllOddNumber
{
   public static void main(String[] args)
   {
   Scanner c=new Scanner(System.in);
   System.out.println("enter a number");
   int num=c.nextInt();
   if(allDigitsOdd(num))
   System.out.println("All the digits are odd in the number "+num);
   else
   System.out.println("Atleast one of the digit is not odd in the number "+num);
   }
   
   public static boolean allDigitsOdd( int n)
   {
      n=Math.abs(n);
      if (n==0)
      return false;
      while(n>0)
      {
         int lastDigit=n%10;
         if(lastDigit%2==0)
         return false;
         else
         n=n/10;
       }
       return true;
    }
  }  
   
