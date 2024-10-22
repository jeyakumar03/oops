import java.util.Scanner;
class bank
{
  
  private int accnum;
  private String actype;
  private long balance;
   public bank(int accnum,String actype,long balance)
  {
    this.accnum=accnum;
    this.actype=actype;
    this.balance=balance;
  }
   public long getbalance()
   {
      return balance;
   }
   public void setbalance()
   {
    if(balance<0)
       System.out.println("Balance cannot be negative");
    else
    {
    this.balance=balance;
    }
   }
    public int getaccnum()
    {
      return accnum;
    }
    public void setaccnum(int accnum)
    {
       if(accnum==0)
          System.out.println("Account number cannot be negative");
       else
       {
       this.accnum=accnum;
    }
   }
    public String getactype()
    {
       return actype;
    }
    public void setactype(String actype)
    {
      if(!actype.equals("savings") || !actype.equals("current"))
      {
         System.out.println("Account type must be valid");
      }
      else
      {
      this.actype=actype;
      }
    }
    public void deposit(double amount)
    {
     if(amount<0)
        System.out.println("Amount cannot be negative");
     balance+=amount;
   }
    public void withdraw(double amount)
    {
      if(amount>balance || balance==0)
         System.out.println("Insufficient Balance");
      else
         balance-=amount;
      
    }
  
public void print()
{
   System.out.println("AccountNumber:"+accnum);
   System.out.println("Accounttype:"+actype);
   System.out.println("Balance:"+balance);
  
}

   
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("ENter the account number:");
        int accnum=ob.nextInt();
        System.out.println("ENter the account type:");
        String actype=ob.next();
        System.out.println("ENter the balance:");
        long balance=ob.nextLong();
       bank b= new bank(accnum,actype,balance);
       System.out.println("Enter the choice:\n 1.Deposit\n2.Withdraw:");
       int choice=ob.nextInt();
       switch(choice)
       {
         case 1:
           System.out.println("Before deposit:");
           b.print();
           System.out.println("Enter the deposit:");
           long dep=ob.nextLong();
           b.deposit(dep);
           System.out.println("After Deposit:");
           b.print();
           break;
        case 2:
           System.out.println("Enter the withdraw amount:");
           int with=ob.nextInt();
           b.withdraw(with);
           System.out.println("After withdraw:");
           b.print();
           break;
         default:
          System.out.println("Please enter a valid choice");
          break;
       }
       
     }
 }
    
