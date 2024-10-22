 
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
