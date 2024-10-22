import java.util.Scanner;
class book
{
  String title;
  String author;
  String publisher;
   void setdata(String title,String author,String publisher)
  {
     this.title=title;
     this.author=author;
     this.publisher=publisher;
   }
   public String gettitle()
   {
      return title;
   }
   public String getauthor()
   {
      return author;
   }
   public String getpublisher()
   {
      return publisher;
   }
 }
 class test
 {
   public static void main(String[] args)
   {
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter the  count:");
      int count=ob.nextInt();
      book[] b=new book[count];
      for(int i=0;i<count;i++)
      {
        b[i]=new book();
      System.out.println("ENter the title of the book:");
      String book=ob.next();
      System.out.println("Enter the author:");
      String author=ob.next();
      System.out.println("Enter the publisher:");
      String publisher=ob.next();
      b[i].setdata(book,author,publisher);
     }
     for(int i=0;i<count;i++)
     {
     System.out.println("Title:"+b[i].gettitle());
     System.out.println("Author:"+b[i].getauthor());
     System.out.println("Publisher:"+b[i].getpublisher());
     }
    }
 }
     
  
