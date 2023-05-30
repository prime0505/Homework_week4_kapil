package methodoverriding23;

public class Bike2 extends Vehical
{
    public void run()
    {
        System.out.println("Bike is running safe...");
    }

    public static void main(String[] args)
    {
        Bike2 b2= new Bike2();
        b2.run();

    }

}
