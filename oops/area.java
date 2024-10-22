import java.util.Scanner;
class shape
{
  private int numside;
  private double area;
  shape(int numside,double area)
  {
    this.numside=numside;
    this.area=area;
  }
  public int getnumside()
  {
    return numside;
  }
  public double getarea()
  {
    return area;
  }
}
class rectangle extends shape
{
  int length;
  int width;
  rectangle(int numside,int length,int width)
  {
    super(numside,length*width);
    this.length=length;
    this.width=width;
  }
  void display()
  {
    System.out.println("It has:"+getnumside()+"  sides ");
    System.out.println("Length:"+length);
    System.out.println("width:"+width);
    System.out.println("Its area is:"+getarea());
  }
}
class area

{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the number of side:");
    int numside=ob.nextInt();
    System.out.println("ENter the length:");
    int length=ob.nextInt();
    System.out.println("Enter the width:");
    int width=ob.nextInt();
    rectangle r=new rectangle(numside,length,width);
    r.display();
  }
}
    

    
