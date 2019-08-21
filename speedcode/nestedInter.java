interface Outer
{
     String Message = "hello";
    
    interface inner
    {
      String message2 = "nastlest";
    }
}

class mainClass
{
  static class Sclass
  {
        void Statmess()
        {
            System.out.println("zzzzzz");
        }
  }


public static void main(String[] args) 
{
    Sclass sc = new Sclass();
   // Outer o = new Outer();
       // @Override

    //sc.Statmess();
}

}