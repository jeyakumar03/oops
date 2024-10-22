import java.util.Scanner;
class container
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the number of elements you want to enter:");
     int n=ob.nextInt();
     int[] height=new int[n];
     System.out.println("Enter the pipe height:");
     for(int i=0;i<n;i++)
     {
      height[i]=ob.nextInt();
     }
     System.out.println(maxarea(height));
  }
  public static int maxarea(int[] height)
  {
      int left=0;int right=height.length-1;
      int maxarea=0;
      while(left<right)
      {
        int area=Math.min(height[left],height[right])*(right-left);
        maxarea=Math.max(area,maxarea);
        if(height[left]<height[right])
          left++;
        else
          right--;
      }
      return maxarea;
   }
 }
