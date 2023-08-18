import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Use for or while loop do the operation.
        int i = 0, j = 0;
        while (i < n) {
            if (j % 2 == 0) {
                if (j % 3 == 0) {
                    sum = sum + j;
                }
                i++;
            }
            j++;
        }
        System.out.print(sum);
    }
}