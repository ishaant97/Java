class KunalKushwahaPatternQuestion {

    public static void pattern1(int n) {
        String patt = "* ";
        for (int i = 1; i <= n; i++) {
            System.out.println(patt.repeat(n));
        }

        // for (int row = 1; row <= n; row++) {
        // for (int column = 1; column <= n; column++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = n; column >= row; column--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int noOfColumn = row < n ? row : 2 * n - row;
            for (int column = 1; column <= noOfColumn; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            int noOfColumn = row < n ? row : 2 * n - row;
            int noOfSpaces = row == n ? 0 : n - noOfColumn;

            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= noOfColumn; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        pattern28(5);
    }

}
