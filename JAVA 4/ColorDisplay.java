import java.util.*;  // for Scanner

public class ColorDisplay {
    public static void main(String[] args){
    Scanner c=new Scanner (System.in);
    System.out.println("What color do you want?");
    String color=c.next();
    if(color.equalsIgnoreCase("G"))
    System.out.println("The color is Green");
    else if(color.equalsIgnoreCase("R"))
    System.out.println("The color is Red");
    else if(color.equalsIgnoreCase("B"))
    System.out.println("The color is Blue");
    else
    System.out.println("Its an error");
   }
 }  
    


