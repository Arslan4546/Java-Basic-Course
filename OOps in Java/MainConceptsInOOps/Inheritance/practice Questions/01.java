// Example 1 

class A {
    int x = 10;

    void print() {
        System.out.println("Class A: " + x);
    }
}

class B extends A {
    int x = 20;

    void print() {
        System.out.println("Class B: " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
        System.out.println(obj.x);
    }
}
