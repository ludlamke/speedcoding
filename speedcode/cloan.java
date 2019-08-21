package speedcode;

class Cloans implements Cloneable
{
    int samenum = 2;
    String sameStrin = "i is same";

    public Object cloan() throws CloneNotSupportedException
    {
      //  Cloans c1 = (Cloans)super.clone();

        return super.clone();
    }
    public static void main(String[] args) 
{
   // Cloans c1 = new Cloans();
   // Cloans c2 = (Cloans) c1.cloan();
}
    
}

