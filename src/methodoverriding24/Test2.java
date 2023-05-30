package methodoverriding24;

public class Test2
{
    public static void main(String[] args)
    {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOutOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOutOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOutOfInterest());

    }
}
