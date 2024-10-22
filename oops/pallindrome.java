import java.util.Scanner;
class pallindrome
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
      String temp=s;
      String a=new StringBuilder(s).reverse().toString();
      System.out.println("The reverse string is :"+a);
      if(temp.equalsIgnoreCase(a))
         System.out.println("True");
      else
         System.out.println("False");
   }
 }
