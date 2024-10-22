import java.util.Scanner;
class animal
{
  private String name;
  private int age;
  private String species;
  animal(String name,int age,String species)
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
}
class dog extends animal
{
  String breed;
  String color;
  dog(String name,int age,String species,String breed,String color)
  {
    super(name,age,species);
    this.breed=breed;
    this.color=color;
  }
  void print()
  {
    System.out.println("Name:"+getname());
    System.out.println("Age;"+getage());
    System.out.println("Species:"+getspecies());
    System.out.println("Breed:"+breed);
    System.out.println("Color:"+color);
  }
}
class test
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     System.out.println("Enter number of count:");
     int n=ob.nextInt();
     dog[] d=new dog[n];
     for(int i=0;i<n;i++)
     {
       System.out.println("Enter the name:");
       String name=ob.next();
       System.out.println("Enter the age:");
       int age=ob.nextInt();
       System.out.println("Enter the species:");
       String species=ob.next();
       System.out.println("Enter the breed:");
       String breed=ob.next();
       System.out.println("Enter the color:");
       String color=ob.nextLine();
       d[i]=new dog(name,age,species,breed,color);
     }
     System.out.println("__________\n Details:\n____________");
     for(int i=0;i<n;i++)
     {
        System.out.println("===========================");
       d[i].print();
       System.out.println("=============================");
     }
   }
}
     
