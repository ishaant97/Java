import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        // Use while loop check the number is Armstrong or not.
        // store the output(1 or 0) in result variable.
        int orignalNumber = n;
        int numberLength = 0;
        int sum = 0;

        while (n != 0) {
            n = n / 10;
            numberLength++;
        }

        n = orignalNumber;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numberLength);
            n /= 10;
        }

        if (sum == orignalNumber)
            System.out.print(1);
        else
            System.out.print(0);

    }
}