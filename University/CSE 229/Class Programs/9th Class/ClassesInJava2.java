class Box {
    int height, width, length;

    public void display() {
        System.out.println("height : " + height + " width : " + width + " length : " + length);
    }
}

public class ClassesInJava2 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.height = 34;
        b1.width = 53;
        b1.length = 80;

        b2.height = 54;
        b2.width = 87;
        b2.length = 96;

        System.out.println("The volume of b1 is : " + b1.height * b1.width * b1.length);
        System.out.println("The volume of b2 is : " + b2.height * b2.width * b2.length);
    }
}
