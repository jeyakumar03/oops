import java.util.Scanner;
class student
{
    String name;
    int age;
    int grade;
    student(String name,int age,int grade)
    {
       this.name=name;
       this.age=age;
       this.grade=grade;
    }
    public void  get()
    {
       System.out.println(name);
       System.out.println(age);
       System.out.println(grade);
    }
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter the name:");
     String name=ob.nextLine();
     System.out.println("Enter the age:");
     int age=ob.nextInt();
     System.out.println("Enter the grade:");
     int grade=ob.nextInt();
     student s=new student(name,age,grade);
     s.get();
  }
}
     
     
