class A {
    public A() {
        System.out.println("a : 1");
    }
}

class B extends A {
    public B() {
        // super() will be by default called!! here
        this(4); // this is what constructor chaining..
        System.out.println("B : 1");
    }

    public B(int k) {
        System.out.println("B : 2");
    }
}

class Chain {
    public static void main(String[] args) {
        B o1 = new B();

    }
}
