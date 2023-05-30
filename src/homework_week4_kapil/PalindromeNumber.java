package homework_week4_kapil;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        n=sc.nextInt();
        if(isPalindrome(n))
        {
            System.out.println(n+" is a Palindrome number");
        }
        else
        {
            System.out.println(n+ " is not Palindrome number");
        }

    }
    public static boolean isPalindrome(int n)
    {
        int r = 0, t = n, m;
        while (n != 0) {
            m = n % 10;
            r = r * 10 + m;
            n = n / 10;
        }
        return t == r;
    }




}
