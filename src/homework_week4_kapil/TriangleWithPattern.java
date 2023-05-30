package homework_week4_kapil;
import java.util.Scanner;

public class TriangleWithPattern
{

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the row numbers: ");
            int n = sc.nextInt();
            int i,j;
            for(i = 0; i < n; i++)
            {
                for(j = 0; j <= i; j++)
                {
                    System.out.print("@");
                }
                    System.out.println();
            }
        }

    }


