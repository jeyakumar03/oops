import java.util.Scanner;
class sample
{
  public static void main(String[] args)
  {
   int[] a={2,0,5,7,1,3};
   print(a);
   
   
  
  }
  public static void print(int[] a)
  {
   for(int i=0;i<a.length;i++)
   {
     int ans;
     ans=a[a[i]];
     System.out.println(ans);
     
   }
  }
}
