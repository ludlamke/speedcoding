interface Thing1
{
default void doesAThing()
{
   System.out.println("i did a thing");
}
}
interface Thing2
{
    default void doesAThing()
    {
       System.out.println("i did a thing but slightly worse");
    }
}

// class Rundathing implements Thing1, Thing2
// {
//     public static void main(String[] args) {
       
//            Thing1.super.doesAThing();
       

       
//     }
// }