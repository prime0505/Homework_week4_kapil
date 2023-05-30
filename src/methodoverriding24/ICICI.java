package methodoverriding24;

public class ICICI extends Bank
{
    @Override
    public int getRateOutOfInterest()
    {
        return 7;
    }
}
