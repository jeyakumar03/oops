import java.util.Scanner;
class reverse
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the number:");
     String s=ob.nextLine();
     get(s);
   }
   public static void get(String s)
   {
      StringBuilder a=new StringBuilder(s).reverse();
      System.out.println("The reverse string is :"+a);
   }
 }
