package treeDemo;

import java.util.*;

public class PriorityQueueAndHeapMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        List<Integer> heap = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert element into Priority Queue");
            System.out.println("2. Remove element from Priority Queue");
            System.out.println("3. Print Priority Queue");
            System.out.println("4. Insert element into Heap");
            System.out.println("5. Remove element from Heap");
            System.out.println("6. Print Heap");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert into Priority Queue: ");
                    int element = scanner.nextInt();
                    priorityQueue.add(element);
                    System.out.println("Element inserted into Priority Queue.");
                    break;
                case 2:
                    if (priorityQueue.isEmpty()) {
                        System.out.println("Priority Queue is empty.");
                    } else {
                        int removedElement = priorityQueue.poll();
                        System.out.println("Removed element from Priority Queue: " + removedElement);
                    }
                    break;
                case 3:
                    System.out.println("Priority Queue: " + priorityQueue);
                    break;
                case 4:
                    System.out.print("Enter the element to insert into Heap: ");
                    int heapElement = scanner.nextInt();
                    heap.add(heapElement);
                    System.out.println("Element inserted into Heap.");
                    break;
                case 5:
                    if (heap.isEmpty()) {
                        System.out.println("Heap is empty.");
                    } else {
                        int removedHeapElement = heap.remove(heap.size() - 1);
                        System.out.println("Removed element from Heap: " + removedHeapElement);
                    }
                    break;
                case 6:
                    System.out.println("Heap: " + heap);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
    }
}
