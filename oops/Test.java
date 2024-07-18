package oops;

class Base {
    public static void display() {
        System.out.println("Static method from Base");
    }
}

class Derived extends Base {
    public static void display() {
        System.out.println("Static method from Derived");
    }
}

public class Test {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.display(); // Calls Base's static method
    }
}

