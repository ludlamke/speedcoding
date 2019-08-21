package speedcode;

class Onion
{
    String onion = "I have cut the onion! ";
    
}
class Onion2 extends Onion
{
    String onion = "I have fried the onion! ";
}
class Onion3 extends Onion2
{
    String onion = "Togther, we have cooked the onion!";
}
class MainScorse extends Onion3
{
    public static void main(String[] args) {
        Onion o = new Onion();
        Onion2 o2 = new Onion2();
        Onion3 o3 = new Onion3();

        int x = -5;
        System.out.println(Math.abs(x));
        System.out.println(o.onion + o2.onion + o3.onion);
        
    }
}