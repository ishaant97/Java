import java.util.*;

public class ArrayList2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int column = in.nextInt();
        // ArrayList<Integer>[][] al = new ArrayList[][];
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                al.get(i).add(j, 1);
                // al[i][j].add(in.nextInt());
            }
        }

        System.out.println(al);

    }
}
