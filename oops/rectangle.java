import java.util.Scanner;
class rectangle
{
  int length;
  int width;
  
  public int getarea(int length,int width)
  {
    this.length=length;
    this.width=width;
    int area=length*width;
    return area;
  }
  public int getperimeter(int length,int width)
  {
    this.length=length;
    this.width=width;
    int perimeter=2*(length+width);
    return perimeter;
  }
 public static void main(String[] args)
 {
    rectangle s=new rectangle();
    System.out.println("Area:"+s.getarea(2,5));
    System.out.println("Perimeter:"+s.getperimeter(2,5));
  }
}
  
