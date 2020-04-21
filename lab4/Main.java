package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClass myClass2 = new MyClass();
        myClass.myField = 1;
        myClass2.myField = 2;
        System.out.println(myClass.myField);
        System.out.println(myClass2.myField);

        Student[] students = new Student[3];
        students[0] = new Student();
//        students[0].age = 16;
        students[0].setAge(16);
        students[1] = new Student();
//        students[1].age = 18;
        students[1].setAge(18);
        students[2] = new Student();
        students[2].setAge(17);

        Arrays.sort(students, Comparator.comparingInt(Student::getAge)
//                .thenComparing(Student::getName)
                .reversed());

        System.out.println("Done!");
    }
}
