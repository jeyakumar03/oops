import java.util.Scanner;
abstract class student
{
   private String name;
   private int age;
   public student(String name,int age)
   {
      this.name=name;
      this.age=age;
   }
   public String getname()
   {
     return name;
   }
   public int getage()
   {
      return age;
    }
   
   abstract void display();
 }
 class undergraduate extends student
 {
    private String branch;
    undergraduate(String name,int age,String branch)
    {
      super(name,age);
      this.branch=branch;
    }
    void display()
    {
       System.out.println("Name:"+getname());
       System.out.println("Age:"+getage());
       System.out.println("Branch:"+branch);
    }
  }
  class postgraduate extends student
  {
     private String researchtopic;
     postgraduate(String name,int age,String researchtopic)
     {
        super(name,age);
        this.researchtopic=researchtopic;
     }
     void display()
     {
       System.out.println("Name:"+getname());
       System.out.println("Age:"+getage());
       System.out.println("Research topic:"+researchtopic);
     }
   }
class abstraction 
  {
     public static void main(String[] args)
     {
         Scanner ob=new Scanner(System.in);
         System.out.println("Enter the ug students name:");
         System.out.println("Enter the name:");
         String name=ob.nextLine();
         System.out.println("Enter the age:");
         int age=ob.nextInt();
         System.out.println("Enter the branch:");
         String branch=ob.next();
         undergraduate ug=new undergraduate(name,age,branch);
         System.out.println("ENter the pg students details:");
         System.out.println("ENter the name;");
         String pname=ob.next();
         System.out.println("Enter the age:");
         int page=ob.nextInt();
         System.out.println("Enter the research topic:");
         String researchtopic=ob.next();
         postgraduate pg=new postgraduate(pname,page,researchtopic);
         System.out.println("Undergraduate students details:");
         ug.display();
         System.out.println("Postgraduate students details:");
         pg.display();
     }
  }
  
         
         
  
