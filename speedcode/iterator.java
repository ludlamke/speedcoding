package speedcode;

class Trychatch
{
    public static void main(String[] args) {
    try 
    {
        int wrong = 6/0;
        System.out.println(wrong);
        int intarray[] = {1,2,3,4,5,6,7,8}; 
        System.out.println(intarray[9]);

     }
    catch(ArithmeticException e)
    {
        System.out.println("no devid by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
         System.out.println("too far basterd");
    }
    finally
    {
        System.out.println("go away");
    }
}
}