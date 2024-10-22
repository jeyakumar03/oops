import java.util.Scanner;
class fact
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the number for factorial:");
     int n=ob.nextInt();
    System.out.println("The factorial is:"+get(n));
  }
  public static int get(int n)
  {
     if(n==1||n==0)
        return 1;
     else
        return n*get(n-1);
   }
 }
