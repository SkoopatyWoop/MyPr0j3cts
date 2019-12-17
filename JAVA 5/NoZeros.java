import java.util.*;  // for Scanner

public class NoZeros {
    public static void main(String[] args){
    Scanner c=new Scanner (System.in);
    System.out.println("Enter number");
    int x=c.nextInt();
    int z=zeroDigit(x);
    System.out.println("The no. of zero digits are"+ z);
    }
    
    public static int zeroDigit(int x)
    {
      int count=0;
      while(x>0)
      {
      int lastDigit=x%10;
      if(lastDigit==0)
      count++;
      
      x=x/10;
      }
      return count;
    }
  }    
