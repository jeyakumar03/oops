import java.util.Scanner;
class vehicle
{
  private String make;
  private String model;
  private String year;
  vehicle(String make,String model,String year)
  {
    this.make=make;
    this.model=model;
    this.year=year;
  }
  public String getmake()
  {
    return make;
   }
   public String getmodel()
   {
      return model;
   }
   public String getyear()
   {
       return year;
   }
}
class car extends vehicle
{
   String color;
   int seat;
   car(String make,String model,String year,String color,int seat)
   {
      super(make,model,year);
      this.color=color;
      this.seat=seat;
   }
   void display()
   {
       System.out.println("Make:"+getmake());
       System.out.println("Model:"+getmodel());
       System.out.println("Year"+getyear());
       System.out.println("Color:"+color);
       System.out.println("Seat:"+seat);
   }
 }
 class test
 {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of details you want to enter :");
        int count=ob.nextInt();
        car[] c=new car[count];
        for(int i=0;i<count;i++)
        {

        System.out.println("Enter the company:");
        String make=ob.next();
        System.out.println("Enter the model;");
        String model=ob.nextLine();
        System.out.println("Enter the year:");
        String year=ob.nextLine();
        System.out.println("Enter the color:");
        String color=ob.nextLine();
        System.out.println("Enter the seat:");
        int seat=ob.nextInt();
        c[i]=new car(make,model,year,color,seat);
        
       }
       for(int i=0;i<count;i++)
       {
          System.out.println("________________");
          c[i].display();
          System.out.println("________________");
        }
}
}

      
  
