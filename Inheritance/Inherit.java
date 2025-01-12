interface A {
    default void methodA() {
        System.out.println("This is from interface A");
    }
}

interface B {
    default void methodB() {
        System.out.println("This is from Interface B");
    }
}

class Myclass implements A, B {
    public void display() {
        System.out.println("This is from myClass");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
    }
}
