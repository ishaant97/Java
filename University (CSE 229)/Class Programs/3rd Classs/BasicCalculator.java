import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print("Enter which operation you want to perform(+,-,*,/) : ");
        char c = sc.next().charAt(0);

        if (c == '+') {
            System.out.print("The result is " + (a + b));
        } else if (c == '-') {
            System.out.print("The result is " + (a - b));
        } else if (c == '*') {
            System.out.print("The result is " + (a * b));
        } else if (c == '/') {
            System.out.print("The result is " + (a / b));
        } else {
            System.out.println("Please enter a valid input");
        }
        sc.close();
    }
}