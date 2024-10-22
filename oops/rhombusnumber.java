import java.io.*;
import java.util.Scanner;
class rhombusnum
{
  public static void main(String[] args)
  {        
    Scanner ob=new Scanner(System.in);
    System.out.println("ENter the number:");
    int n=ob.nextInt();
    for(int i=0;i<n;i++)
    {
       for(int j=n-1;j>i;j--)
       {
          System.out.print(" ");
       }
       for(int j=i;j>=1;j--)
       {
          System.out.print(j);
       }
       for(int j=2;j<=i;j++)
       {
          System.out.print(j);
       }
       System.out.println();
       }
         for(int i=n-1;i>=0;i--)
    {
       for(int j=n-1;j>=i;j--)
       {
          System.out.print(" ");
       }
       for(int j=i;j>=1;j--)
       {
          System.out.print(j);
       }
       for(int j=2;j<=i;j++)
       {
          System.out.print(j);
       }
       System.out.println();
       }
   }
}

