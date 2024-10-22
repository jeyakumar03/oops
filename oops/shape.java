import java.util.Scanner;
class shape
{
  void draw()
  {
     System.out.println(" Draws a shape");
  }
}
class rectangle extends shape
{
  void draw()
  {
     System.out.println("It draws a rectangle");
  }
}
class circle extends shape
{
 void draw()
 {
    System.out.println("It draws a circle");
 }
}
class test
{
  public static void main(String[] args)
  {
     circle c=new circle();
     rectangle r=new rectangle();
     shape s=new shape();
     s.draw();
     r.draw();
     c.draw();
  }
} 
