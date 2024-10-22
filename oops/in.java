interface playable
{
  void play();
}
class guitar implements playable
{
  void display()
  {
     System.out.println("It is guitar");
  }
}
class piano implements playbale
{
 void display()
 {
   System.out.println("it is piano");
 }
}
class in
{
 public static void main(String[] args)
 {
   piano p=new piano();
   guitar g=new gutitar();
   g.display();
   p.display();
 }
}
