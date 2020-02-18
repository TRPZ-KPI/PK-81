package lab7.linkedSet;

import lab4.Student;

public class Main {
    public static void main(String[] args) {
        MyLinkedSet myLinkedSet = new MyLinkedSet();
        System.out.println(myLinkedSet.size());
        System.out.println("myLinkedSet.isEmpty() = " + myLinkedSet.isEmpty());
        System.out.println(myLinkedSet.add(new Student("SuperStudent!")));
        System.out.println(myLinkedSet.add(new Student("SuperStudent!2")));
        System.out.println(myLinkedSet.add(new Student("SuperStudent!3")));
        System.out.println(myLinkedSet.size());
        System.out.println(myLinkedSet.isEmpty());
        System.out.println("contains = " + myLinkedSet.contains(new Student("SuperStudent!2")));

    }
}
