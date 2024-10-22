import java.util.Scanner;
class max
{
   public static void main(String[] args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("ENter the size;");
      int n=ob.nextInt();
      int[] a=new int[n];
      System.out.println("Enter the array element :");
      for(int i=0;i<n;i++)
      {
        a[i]=ob.nextInt();
      }
      get(a,n);
   }
   public static void get(int[] a,int n)
   {
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
           if(a[i]>a[j])
           {
             int temp=a[i];
             a[i]=a[j];
             a[j]=temp;
           }
        }
      }
     System.out.println("The largest element is:"+a[n-1]);
  }
}
      
