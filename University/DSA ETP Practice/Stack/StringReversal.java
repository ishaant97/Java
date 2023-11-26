import java.util.*;

class StringReversal {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = in.nextLine();
        // StringBuilder sReversed = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        System.out.print("The reversed string is : ");
        for (int i = 0; i < s.length(); i++) {
            // sReversed.append(st.pop());
            System.out.print(st.pop());
        }

        // System.out.println("The reversed string is : " + sReversed);

        in.close();
    }
}
