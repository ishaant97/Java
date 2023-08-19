// This is the main class Question
public class Exercise2_3 {
    public static void main(String[] args) {
        // Object of the main class is created
        Exercise2_3 q = new Exercise2_3();
        // Print method on object of Question class is called
        q.studentMethod();
    }

    // 'print()' method is defined in class Question
    void print(Exercise2_3 object) {
        System.out.print("Well Done!");
    }
    // Define a method named 'studentMethod()' in class Question

    // Call the method named 'print()' in class Question
    void studentMethod() {
        print(this);
    }
}