import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to check weather it is a Palindrome or not : ");
        int a = input.nextInt();

        int original = a;
        int reverse = 0;
        int digit;

        while (a > 0) {
            digit = a % 10;
            reverse = (reverse * 10) + digit;
            a = a / 10;
        }

        if (original == reverse) {
            System.out.print("The number entered is Palindrome");
        } else {
            System.out.print("The number entred is not a Palindrome");
        }

        input.close();
    }
}