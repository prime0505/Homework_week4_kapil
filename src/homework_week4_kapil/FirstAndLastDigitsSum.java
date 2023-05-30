package homework_week4_kapil;

public class FirstAndLastDigitsSum
{
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int originalNumber = number;
            // extracting the last digit of a number
            int lastDigit = number % 10;
            // firstDigit variable initialized as equal to 0
            int firstDigit = 0;

            if (number < 10)
            {
                firstDigit = lastDigit;
            } else
            {
                while (number > 1)
                {
                    number = number / 10;
                    if (number == 0)
                    {
                        break;
                    }
                    firstDigit = number;
                }
            }
            // returns the sum of the first and last digits of a given number
            if (originalNumber > 9) {
                System.out.println("The first digit of " + originalNumber + " is " + firstDigit + ", and the last digit of that number is " + lastDigit + ". The sum of them is equal to: ");
            } else {
                System.out.println("The first digit of " + originalNumber + " is equal to the last digit, since there is only one digit. Therefore, the sum of them (" + firstDigit + " + " + lastDigit + ") is equal to: ");
            }
            return firstDigit + lastDigit;
        }

        System.out.println("The input was invalid, since the program accepts only positive integers.");
        return -1;
    }
}

