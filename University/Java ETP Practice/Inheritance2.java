
class Student {
    // store name,ANo, STD
    String name;
    int addmissionNumber;
    int section;
}

class Report extends Student {
    int percentage;
    int passResult;

    Report(int percentage, int passResult, String name, int addmissionNumber, int section) {
        this.percentage = percentage;
        this.passResult = passResult;
        super.name = name;
        super.addmissionNumber = addmissionNumber;
        super.section = section;
    }
}

class Bus extends Student {
    int routeNumber;
    String bloodGroup;

    Bus(int routeNumber, String bloodGroup) {
        this.routeNumber = routeNumber;
        this.bloodGroup = bloodGroup;
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        System.out.println("hi");
        // Report obj1 = new Report(0, 0, null, 0, 0);
        // Bus obj1 = new Bus(0, null);
    }
}
