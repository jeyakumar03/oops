import java.util.Scanner;
class mars
{
public static void main(String[] args)
{
  Scanner ob=new Scanner(System.in);
  System.out.println("Enter the message:");
  String s=ob.next();
  exploration(s);
 }
 public static void exploration(String s)
{
  int count=0;
  for(int i=0;i<s.length();i=i+2)
  {
    if(s.charAt(i)!='s')
      count++;
    if(s.charAt(i)!='o')
       count++;
    if(s.charAt(i)!='s')
       count++;
   }
    System.out.println("COunt:"+count);
  }
}
