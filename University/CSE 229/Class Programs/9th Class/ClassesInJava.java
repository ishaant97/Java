class Car {
    String color;
    int tyres, seats;

    public void display() {
        System.out.println("Color : " + color + " tyres : " + tyres + " Seats : " + seats);
    }
}

public class ClassesInJava {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "Red";
        car1.display();
        car2.display();
    }
}