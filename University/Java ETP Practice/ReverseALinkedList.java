import java.util.LinkedList;

interface MyPrinter {
    void myPrinter();
}

public class ReverseALinkedList implements MyPrinter {

    public void myPrinter() {
        System.out.println("HE");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int size = list.size();
        int temp;
        System.out.println(list);

        for (int i = 0; i < size / 2; i++) {
            temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - 1 - i, temp);
        }
        System.out.println(list);
    }
}