package lab7;

import lab4.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Main myMain = new Main();
        System.out.println(myMain.toString());

        MySet mySet = new MySet();
        MySet mySet2 = new MySet(new Student());
        MySet mySet3 = new MySet(new ArrayList<Student>());
        System.out.println(mySet.size());
        System.out.println(mySet.add(new Student()));
        System.out.println(mySet.size());
    }
}
