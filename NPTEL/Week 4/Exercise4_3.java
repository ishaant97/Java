interface ExtraLarge {
    String extra = "This is extra-large";

    public void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}

class Medium extends Large {
    public void Print() {
        super.Print();
        System.out.println("This is medium");
    }
}

class Small extends Medium {
    public void Print() {
        super.Print();
        System.out.println("This is small");
    }
}

class Exercise4_3 implements ExtraLarge {

    public void display() {
        System.out.print(extra);
    }

    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
        Exercise4_3 q = new Exercise4_3();
        q.display();
    }
}