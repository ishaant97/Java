import java.util.*;

class NumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("The provided number is even");
        } else {
            System.out.println("The provided number is odd");
        }

        sc.close();

    }
}
