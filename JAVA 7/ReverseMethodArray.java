//Read temperatures from the user and reverses the values in the array.
import java.util.*;
public class ReverseMethodArray {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How many days' temperatures? ");
      int days = console.nextInt();
      int[] temps = new int[days];        
      // array to store days' temperatures
     // int sum = 0;
      for (int i = 0; i < days; i++) 
      {    
      // read/store each day's temperature
      System.out.print("Day " + (i + 1) + "'s high temp: ");
      temps[i] = console.nextInt();
       }
      //reverse temperatures
      reverse(temps);
        System.out.println("The revesed temperature values are");     
       for (int i=0;i<temps.length;i++)
       {
       System.out.print(temps[i]+ "  ");
       } 
     }
     
     public static void reverse(int[]x)
     {
     for(int i=0;i<x.length/2;i++)
      {
         int c= x[i];
         x[i]=x[x.length-1-i];
         x[x.length-1-i]=c;
       }
     }  

     
 }      