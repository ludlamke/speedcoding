package speedcode;

class Shallo
{
    int one = 1;
    int two = 2;
    public Object cloan() throws CloneNotSupportedException
    {
        Shallo s1 = (Shallo)super.clone();

        return s1;
    }

    public static void main(String[] args) {
      
    
    }

}