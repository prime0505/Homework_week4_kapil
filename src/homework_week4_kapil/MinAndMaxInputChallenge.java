package homework_week4_kapil;

import java.util.Scanner;

public class MinAndMaxInputChallenge
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, max, min;
        System.out.println(" Please Enter First Number:  ");
        num1 = sc.nextInt();
        System.out.print("Please enter second  number: ");
        num2 = sc.nextInt();
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
        while (num2 != -99)
        {
            System.out.print(" Please enter a number or Enter -99 to stop: ");
            num2 = sc.nextInt();
            if (num2 != -99)
            {
                max = Math.max(max, num2);
                min = Math.min(min, num2);
            }

        }
        System.out.println("The Maximum number is: " + max);
        System.out.println("The Minimum number is: " + min);
        sc.close();

    }

}
