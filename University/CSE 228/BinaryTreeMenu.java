package treeDemo;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class BinaryTreeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        BinarySearchTree bst = new BinarySearchTree();

        while (true) {
            System.out.println("Binary Tree Operations:");
            System.out.println("1. Tree Traversal (DFS & BFS)");
            System.out.println("2. Mirroring a Tree");
            System.out.println("3. Spiral Order Traversal");
            System.out.println("4. Binary Search Tree Operations");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tree Traversal Options:");
                    System.out.println("a. Depth-First Search (DFS)");
                    System.out.println("b. Breadth-First Search (BFS)");
                    System.out.print("Enter your sub-choice (a/b): ");
                    String traversalChoice = scanner.next();
                    if (traversalChoice.equals("a")) {
                        tree.dfs();
                    } else if (traversalChoice.equals("b")) {
                        tree.bfs();
                    }
                    break;
                case 2:
                    tree.mirror();
                    break;
                case 3:
                    tree.spiralOrderTraversal();
                    break;
                case 4:
                    System.out.println("Binary Search Tree (BST) Operations:");
                    System.out.println("a. Search");
                    System.out.println("b. Insertion");
                    System.out.println("c. Deletion");
                    System.out.println("d. Lowest Common Ancestor");
                    System.out.println("e. Balanced BST");
                    System.out.print("Enter your sub-choice (a/b/c/d/e): ");
                    String bstChoice = scanner.next();
                    if (bstChoice.equals("a")) {
                        System.out.print("Enter the value to search: ");
                        int value = scanner.nextInt();
                        bst.search(value);
                    } else if (bstChoice.equals("b")) {
                        System.out.print("Enter the value to insert: ");
                        int value = scanner.nextInt();
                        bst.insert(value);
                    } else if (bstChoice.equals("c")) {
                        System.out.print("Enter the value to delete: ");
                        int value = scanner.nextInt();
                        bst.delete(value);
                    } else if (bstChoice.equals("d")) {
                        System.out.print("Enter the first value: ");
                        int value1 = scanner.nextInt();
                        System.out.print("Enter the second value: ");
                        int value2 = scanner.nextInt();
                        bst.findLowestCommonAncestor(value1, value2);
                    } else if (bstChoice.equals("e")) {
                        bst.checkBalanced();
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class BinaryTree {
    TreeNode root;

    // Breadth-First Search (BFS)
    public void bfs() {
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
        }
    }

    // Depth-First Search (DFS)
    public void dfs() {
        dfsHelper(root);
    }

    private void dfsHelper(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.val + " ");
        dfsHelper(node.left);
        dfsHelper(node.right);
    }

    // Mirror the Binary Tree
    public void mirror() {
        root = mirrorHelper(root);
    }

    private TreeNode mirrorHelper(TreeNode node) {
        if (node == null)
            return null;

        TreeNode left = mirrorHelper(node.left);
        TreeNode right = mirrorHelper(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    // Spiral Order Traversal
    public void spiralOrderTraversal() {
        if (root == null)
            return;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                System.out.print(node.val + " ");

                if (node.right != null)
                    stack2.push(node.right);
                if (node.left != null)
                    stack2.push(node.left);
            }

            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                System.out.print(node.val + " ");

                if (node.left != null)
                    stack1.push(node.left);
                if (node.right != null)
                    stack1.push(node.right);
            }
        }
    }
}

class BinarySearchTree {
    TreeNode root;

    // Search for a value in BST
    public boolean search(int value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(TreeNode node, int value) {
        if (node == null)
            return false;
        if (node.val == value)
            return true;
        if (value < node.val)
            return searchHelper(node.left, value);
        return searchHelper(node.right, value);
    }

    // Insert a value into BST
    public void insert(int value) {
        root = insertHelper(root, value);
    }

    private TreeNode insertHelper(TreeNode node, int value) {
        if (node == null)
            return new TreeNode(value);

        if (value < node.val)
            node.left = insertHelper(node.left, value);
        else if (value > node.val)
            node.right = insertHelper(node.right, value);

        return node;
    }

    // Delete a value from BST
    public void delete(int value) {
        root = deleteHelper(root, value);
    }

    private TreeNode deleteHelper(TreeNode node, int value) {
        if (node == null)
            return null;

        if (value < node.val)
            node.left = deleteHelper(node.left, value);
        else if (value > node.val)
            node.right = deleteHelper(node.right, value);
        else {
            if (node.left == null)
                return node.right;
            if (node.right == null)
                return node.left;

            node.val = findMin(node.right);
            node.right = deleteHelper(node.right, node.val);
        }

        return node;
    }

    private int findMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node.val;
    }

    // Find Lowest Common Ancestor (LCA) in BST
    public int findLowestCommonAncestor(int value1, int value2) {
        return findLCAHelper(root, value1, value2);
    }

    private int findLCAHelper(TreeNode node, int value1, int value2) {
        if (node == null)
            return -1;

        if (value1 < node.val && value2 < node.val)
            return findLCAHelper(node.left, value1, value2);
        else if (value1 > node.val && value2 > node.val)
            return findLCAHelper(node.right, value1, value2);
        else
            return node.val;
    }

    // Check if the BST is Balanced
    public boolean checkBalanced() {
        return checkBalancedHelper(root) != -1;
    }

    private int checkBalancedHelper(TreeNode node) {
        if (node == null)
            return 0;

        int leftHeight = checkBalancedHelper(node.left);
        int rightHeight = checkBalancedHelper(node.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
