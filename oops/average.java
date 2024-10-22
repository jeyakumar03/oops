import java.util.Scanner;
class average
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the size:");
     int n=ob.nextInt();
     int[] a=new int[n];
     System.out.println("Enter the array:");
     for(int i=0;i<n;i++)
     {
        a[i]=ob.nextInt();
     }
     get(a,n);
  }
  public static void get(int[] a,int n)
  {
     int sum=0;int avg=0;
     for(int i=0;i<n;i++)
     {
        sum+=a[i];
     }
     avg=sum/n;
    System.out.println("The average is:"+avg);
 }
}
