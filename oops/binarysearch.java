import java.util.Scanner;
class binarysearch
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the size:");
     int n=ob.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++)
     {
        a[i]=ob.nextInt();
     }
     System.out.println("Enter the number you want to search:");
     int search=ob.nextInt();
     int l=0;
     int r=n-1;
     int result=find(a,l,r,search);
     if(result!=-1)
     {
        System.out.println("It is present at the position:"+result);
     }
     else
     {
        System.out.println("It is not present at the position");
     }
  }
  public static int find(int[] arr,int l,int r,int search)
  {
  while(l<=r)
  {
     int mid=(l+r)/2;
     if(arr[mid]==search)
     {
        return mid;
     }
     else if(arr[mid]>search)
     {
         r=r-1;
     }
     else
     {
        l=l+1;
     }

  }
       return -1;
 }
}
  
