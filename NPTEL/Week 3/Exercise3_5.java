import java.util.Scanner;

class Question { // Define a class Question with two elements e1 and e2.
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); // Read e1
    int e2 = sc.nextInt(); // Read e2
}

public class Exercise3_5 {
    // Define static method swap()to swap the values of e1 and e2 of class Question.
    public static void swap(Question t) {

        int x = t.e1;
        t.e1 = t.e2;
        t.e2 = x;
    }

    public static void main(String[] args) {
        // Create an object of class Question
        Question t = new Question();
        // Call the method swap()
        swap(t);

        System.out.println(t.e1 + " " + t.e2);
    }

}