import java.util.*;
public class BMICalulator
{
   public static void main(String[] args)
   {
   Scanner obj1 =new Scanner(System.in);
   System.out.println("enter height and weight value");
   double ht= obj1.nextDouble();
   double wt= obj1.nextDouble();
   double BMI=wt/(ht*ht)*703;
   // report
   if (BMI<18.5)
   {
   System.out.println("Underweight");
   }
   else if(BMI<=24.9)
   {
   System.out.println("Normal");
   }
   else if (BMI<=29.9)
   {
   System.out.println("Overweight");
   }
   else
   {
   System.out.println("Obese");
   }
   
   }
}   
   
   
   
   
   
   
   
     