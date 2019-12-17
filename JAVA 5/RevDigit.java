import java.util.*;
public class RevDigit
{
   public static void main(String[] args)
   {
   Scanner c=new Scanner(System.in);
   System.out.println("enter a number");
   int num=c.nextInt();
   int rev=digitRev(num);
   System.out.println("The reverse of the number is "+rev);
   }


   public static int digitRev(int n)
   {
      int rev=0;
      n = Math.abs(n);           // handle negativesint sum = 0;
      while (n > 0) 
      {
         rev = rev*10+ (n % 10);  // add last 
         n = n / 10;            
// remove last digit
      }
         return rev;
    }
}