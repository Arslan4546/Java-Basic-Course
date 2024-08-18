class Copy {
    int a;
    String b;

    // Default constructor
    Copy() {
        this.a = 10;
        this.b = "Arslan is the best Student Ever";
        System.out.println(a + " " + b);
    }

    // Copy constructor
    Copy(Copy ref) {
        this.a = ref.a;
        this.b = ref.b;
        System.out.println(a + " " + b);
    }
}

class C {
    public static void main(String[] args) {
        Copy obj = new Copy();    // Calls the default constructor
        Copy obj1 = new Copy(obj); // Calls the copy constructor
    }
}
