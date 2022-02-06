public class FormattingOutput
{
   public static void main(String[] args)
   {
      for (int i = 1; i <= 3; i++) 
      { 
         for (int j = 1; j <= 10; j++)
            {
            System.out.printf("%-4d", (i * j));
         }
       System.out.println();   // to end the line
      }
      double x=2.13*1/7;
      System.out.printf("%6.2f",x);
   }
 }     