import java.util.*;

public class reverseString {

    public static String reverse(String a) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < a.length(); i++) {
            stack.push(a.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String to reverse it : ");
        String enter = input.nextLine();

        String reversedString = reverse(enter);

        System.out.print(reversedString);

        input.close();
    }
}
