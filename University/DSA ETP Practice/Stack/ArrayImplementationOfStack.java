import java.util.*;
import java.util.Arrays;

class MyStack {
    int maxSize;

    MyStack(int maxSize) {
        this.maxSize = maxSize;

    }

    int arr[] = new int[maxSize];

    void push(int item) {
        if (arr.length == maxSize) {
            System.out.print("Stack OverFlow");
        } else {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = item;
        }
    }

    void pop() {
        if (arr.length == 0) {
            System.out.print("Stack UnderFlow");
        } else {
            System.out.print("The poped item is : " + arr[arr.length - 1]);
            arr = Arrays.copyOf(arr, arr.length - 1);
        }
    }

    void display() {
        if (arr.length == 0) {
            System.out.println("Stack underflow");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}

class ArrayImplementationOfStack {
    public static void main(String[] args) {
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the maxsize of the stack : ");
        int maxSize = in.nextInt();
        MyStack st = new MyStack(maxSize);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n1.Push\n2.Pop\n3.Display\n4.Exit");
            System.out.print("Enter your choice : ");
            choice = in.nextInt();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the value to push : ");
                    int item = in.nextInt();
                    st.push(item);
                    System.out.println("Item Pushed Successfully");
                    break;
                }
                case 2: {
                    st.pop();
                    break;
                }
                case 3: {
                    st.display();
                    break;
                }
                case 4: {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice ");
                }
            }
            ;
        }

        in.close();
    }
}
