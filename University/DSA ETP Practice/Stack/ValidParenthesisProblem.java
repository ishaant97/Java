import java.util.*;

class ValidParenthesisProblem {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String in = sc.nextLine();
        int check = 1;

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '(') {
                st.push(in.charAt(i));
            } else if (in.charAt(i) == '{') {
                st.push(in.charAt(i));
            } else if (in.charAt(i) == '[') {
                st.push(in.charAt(i));
            } else {
                if (st.isEmpty()) {
                    check = 0;
                    break;
                } else if (in.charAt(i) == ')') {
                    if (st.peek() == '(') {
                        st.pop();
                    } else {
                        check = 0;
                    }
                } else if (in.charAt(i) == '}') {
                    if (st.peek() == '{') {
                        st.pop();
                    } else {
                        check = 0;
                    }
                } else if (in.charAt(i) == ']') {
                    if (st.peek() == '[') {
                        st.pop();
                    } else {
                        check = 0;
                    }
                } else {
                    check = 0;
                }
            }
        }

        if (!st.isEmpty()) {
            check = 0;
        }

        System.out.println(check == 1 ? "Valid" : "Invalid");

        sc.close();
    }
}