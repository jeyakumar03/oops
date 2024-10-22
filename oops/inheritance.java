import java.util.Scanner;
class animal
{
  private String name;
  private int age;
  private String species;
  void getdetails(String name,int age,String species)
  {
    this.name=name;
    this.age=age;
    this.species=species;
  }
  public String getname()
  {
    return name;
  }
  public int getage()
  {
     return age;
  }
  public String getspecies()
  {
     return species;
  }
  void display()
  {
    System.out.println("Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("species:"+species);
  }
}
class dog extends animal
{
  String breed;
  String color;
  void get(String name,int age,String species,String breed,String color)
  {
    super.getdetails( name, age,species);
    this.breed=breed;
    this.color=color;
  }
  void display()
  {
   super.display();
   System.out.println("Breed:"+breed);
   System.out.println("Color:"+color);
  }
}
class inheritance
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter how many data you want to enter:");
     int count=ob.nextInt();
     dog[] d=new dog[count];
     for(int i=0;i<count;i++)
     {
      d[i]=new dog();
      System.out.println("Enter the name:");
      String name=ob.next();
      System.out.println("Enter the age:");
      int age=ob.nextInt();
      System.out.println("Enter the species:");
      String species=ob.next();
      System.out.println("Enter the breed name:");
      String breed=ob.next();
      System.out.println("ENter the color:");
      String color=ob.next();
      d[i].get(name,age,species,breed,color);
     }
     System.out.println("Details:");
     System.out.println("________");
     for(int i=0;i<count;i++)
     {
        d[i].display();
     }
   }
}
      

