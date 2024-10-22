import java.util.Scanner;
class person
{
  private String name;
  private int age;
  private String address;
  person(String name,int age,String address)
  {
    this.name=name;
    this.age=age;
    this.address=address;
  }
  public String getname()
  {
     return name;
  }
  public int getage()
  {
     return age;
  }
  public String getaddress()
  {
    return address;
  }
 }
 class student extends person
 {
   int grade;
   String school;
   student(String name,int age,String address,int grade,String school)
   {
     super(name,age,address);
     this.grade=grade;
     this.school=school;
    }
    void display()
    {
       System.out.println("==========================================================");
       System.out.println("Name:"+getname());
       System.out.println("Age:"+getage());
       System.out.println("Address:"+getaddress());
       System.out.println("grade:"+grade);
       System.out.println("School:"+school);
       System.out.println("==========================================================");
    }
 }
 class employee extends person
 {
  double salary;
  String companyname;
    employee(String name,int age,String address,double salary,String companyname)
    {
     super(name,age,address);
     this.salary=salary;
     this.companyname=companyname;
    }
    void display()
    {
      System.out.println("=========================================================");
      System.out.println("Name:"+getname());
      System.out.println("Age:"+getage());
      System.out.println("Address:"+getaddress());
      System.out.println("Salary:"+salary);
      System.out.println("comapany name"+companyname);
      System.out.println("==========================================================");
    }
 }
 class details
 {
   public static void main(String[] args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the students details:");
      System.out.println("Enter the name:");
      String name=ob.next();
      System.out.println("Enter the age:");
      int age=ob.nextInt();
      System.out.println("Enter the address:");
      String address=ob.next();
      System.out.println("Enter the grade:");
      int grade=ob.nextInt();
      System.out.println("Enter the school name:");
      String school=ob.next();
      student s=new student(name,age,address,grade,school);
      s.display();
      System.out.println("Enter the employee details:");
      System.out.println("Enter the name:");
      String ename=ob.next();
      System.out.println("Enter the age:");
      int eage=ob.nextInt();
      System.out.println("Enter the address:");
      String eaddress=ob.next();
      System.out.println("Enter the Salary:");
      double salary=ob.nextDouble();
      System.out.println("Enter the company  name:");
      String company=ob.next();
      employee e=new employee(ename,eage,eaddress,salary,company);
      e.display();
   }
 }
    
   
