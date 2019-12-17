import java.util.*;
public class QuadranteCal
{
   public static void main(String[] args)
   {
      Scanner obj1=new Scanner (System.in);
      System.out.println(" enter x and y co ordinates");
      double x=obj1.nextDouble();
      double y=obj1.nextDouble();
      int r=quadrant(x, y);
      
      if(r==1)
      System.out.println("quadrant 1");
      else if(r==2)
      System.out.println("quadrant 2"); 
      else if(r==3)
      System.out.println("quadrant 3");  
      else if(r==4)
      System.out.println("quadrant 4"); 
      else if(r==0)
      System.out.println("On the AXIS");
        
    }
    
    public static int quadrant(double x, double y)
     {
         if (x > 0 && y > 0) 
         {
            return 1;
         } 
         else if (x < 0 && y > 0) 
         {return 2;}
         else if (x < 0 && y < 0) 
         {return 3;} 
         else if (x > 0 && y < 0)
          {return 4;} 
         else {  return 0;}
      } 
  }      
          // at least one coordinate equals 0return 0;}}