public class Ovrld {
    int id;
    int age;
    String name;

    Ovrld(int l, String a) {
        this.id = l;
        this.name = a;
    }

    Ovrld(int l, int m, String a) {
        this.id = l;
        this.age = m;
        this.name = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Ovrld s1 = new Ovrld(1, 7, "Ramu");
        Ovrld s2 = new Ovrld(7, "Ramu");

        s1.display();
        s2.display();
    }
}
