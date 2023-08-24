interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
class Exercise4_4 implements First, Second {
    // Overriding default show method
    public void show() {
        // Call show() of First interface.
        // Call show() of Second interface.

        First.super.show();

        Second.super.show();
    }

    public static void main(String args[]) {
        Exercise4_4 q = new Exercise4_4();
        q.show();
    }
}