import java.util.*;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int i = 1;

        while (i <= n) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        input.close();
    }
}