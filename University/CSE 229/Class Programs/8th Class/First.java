import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        String b = (a % 2 == 0 && a < 10) ? "digit" : String.format("%d", a);
        System.out.println(b);
        input.close();
    }
}