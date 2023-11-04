import java.util.*;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int x = sc.nextInt();

        if (x <= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
        sc.close();
    }
}