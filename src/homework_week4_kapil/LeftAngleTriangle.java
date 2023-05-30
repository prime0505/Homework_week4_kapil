package homework_week4_kapil;
import java.util.Scanner;
public class LeftAngleTriangle
{
    public static void main(String[] args) {
        star();
    }

    public static void star() {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number : ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
