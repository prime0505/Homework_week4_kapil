package homework_week4_kapil;
import java.util.Scanner;

public class ArmstrongNumber
{

    public static void main(String[] args) {

        int originalNumber, remainder, result = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number=sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }


}
