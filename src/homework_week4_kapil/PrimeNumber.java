package homework_week4_kapil;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number to check it is prime or not: ");
        int num=sc.nextInt();
        if(isprime (num))
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not prime number");

        }
        sc.close();
    }

    public static boolean isprime(int num)
    {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

}
