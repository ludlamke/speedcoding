package speedcode;

import java.util.Scanner;
class assur
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter age");
      // int age = sc.nextInt();
       int age = 2;
       int targetAge = 21;


        assert  age >= targetAge:
        "drink";

    
       System.out.println("no drink"); 

        sc.close();
    }
}