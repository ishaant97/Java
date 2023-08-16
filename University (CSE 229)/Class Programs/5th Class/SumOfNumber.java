import java.util.*;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number you want the sum till : ");
        int n = input.nextInt();

        int sum = 0;

        int i = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.print("Sum of all the numbers till " + n + " is " + sum);
        input.close();
    }
}
