import java.util.Scanner;
import java.math.*;
class tower
{
   public static void main(String[] args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=ob.nextInt();
      hanoi(n,'A','C','B');
      
    }
    static void hanoi(int n,char from_rod,char to_rod,char aux_rod)
    {
     if(n==0)
     {
        return;
     }
     hanoi(n-1,from_rod,aux_rod,to_rod);
     System.out.println("Move:"+n+" from rod "+from_rod+"  to rod  "+to_rod);
     hanoi(n-1,aux_rod,to_rod,from_rod);
    }
     
}
