import java.util.Scanner;
class employee
{
  private String name;
  private double salary;
  private String date;
  public void setdata(String x,double y,String z)
  {
    name=x;
    salary=y;
    date=z;
  }
  public String getname()
  {
    return name;
   }
   public double getsalary()
   {
     return salary;
   }
   public String getdate()
   {
   return date;
   }
 }
 class ma extends employee
 {
   public static void main(String[] args)
   {
      //employee emp=new employee();
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter how many people ?");
      int  count=ob.nextInt();
       employee[] employees=new employee[count];
      for(int i=0;i<count;i++)
      {
        employees[i]=new employee();
        System.out.println("Enter the name:");
        String name=ob.next();
        System.out.println("Enter the salary:");
        double salary=ob.nextDouble();
        System.out.println("Enter the date:");
        String date=ob.next();
        employees[i].setdata(name,salary,date);
      }
      System.out.println("THe details of the employee:");
      for(int i=0;i<count;i++)
      {
      System.out.println("Name:"+employees[i].getname());
      System.out.println("Salary:"+employees[i].getsalary());
      System.out.println("Date"+employees[i].getdate());
     }
  
      
     
   }
 }
 
 

