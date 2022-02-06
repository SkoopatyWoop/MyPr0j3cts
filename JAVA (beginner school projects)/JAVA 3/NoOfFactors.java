import java.util.*;
public class NoOfFactors
{
   public static void main(String [] args)
   {
   Scanner obj1=new Scanner(System.in);
   System.out.println("Enter the number for which you want to find number of factors");
   int number= obj1.nextInt();
   int count=countFactors(number);
   System.out.println("The number of factors are" +count);
   
   // to find whether a number is prime or not
   if (count ==2)
   System.out.println("The given number is a prime number");
   else
   System.out.println("The given number is not a prime number");

   }

 //Returns how many factors the given number has.

public static int countFactors(int number) 
 {
   int count = 0;
   for (int i = 1; i <= number; i++) 
   {
      if (number % i == 0) 
      {
      count++;  // i is a factor of number
      }
    }return count;
 }
} 
 