import java.util.Scanner;
class maruthi
{
  void details()
  {
    System.out.println("Maximum 4 person can seat");
    System.out.println("It is a small budget car");
  }
  
  void speed()
  {
     System.out.println("It runs 80kmph");
  }
}
class inova extends maruthi
{
  void details()
  {
    System.out.println("MAximum 7 person can be seat");
    System.out.println("It is a medium budget car");
  }
  void speed()
  {
    System.out.println("It runs 150Kmph");
  }
}
class override
{
  public static void main(String[] args)
  {
    inova i=new inova();
    maruthi m=new maruthi();
    System.out.println("Maruti car:\n _________");
    m.details();
    m.speed();
    System.out.println("==============");
    System.out.println("Innova:\n_______");
    i.details();
    i.speed();
    
  }
}
   
  
