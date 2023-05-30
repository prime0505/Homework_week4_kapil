package homework_week4_kapil;

public class DigitSumChallenge
{
    public static int sumDigits(int number)
    {
        if (number < 10)
        {
            return -1;
        }

        int sumDigits = 0;

        String numberToString = Integer.toString(number);
        for (char c : numberToString.toCharArray()) {

            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 125 is = " + sumDigits(125));
        System.out.println("Sum of 854 is = " + sumDigits(854));
        System.out.println("Sum of 18 is = " + sumDigits(18));
        System.out.println("Sum of -3 is = " + sumDigits(-3));
    }
}
