class MainClass {
    public static void main(String[] args) {
        int intArray[] = { 1, 3, 4, 5 };
        try {
            // code that may throw an exception
            for (int i = 0; i < 5; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
    }
}