package test;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        A.f = 1;
        System.out.println(a2.f);
    }
}
