package lab8;

import lab4.Student;
import lab7.linkedSet.MyLinkedSet;

public class Main {
    public static void main(String[] args) /*throws Exception*/ {
        /*Student student = null;
        try {
            student = new Student("", "", "", 1, 1);
        } catch (NameException e) {
            System.out.println("Name can't be empty.");
//            System.exit(1);
        }*/
//        student.setName("");

        MyLinkedSet myLinkedSet = new MyLinkedSet();
        try {
//            System.out.println(1/0);
//            throw new NameException();
            myLinkedSet.add(new Student("Oleksii", "", "",1, 1));
//            myLinkedSet.add(new CorrespondenceStudent());
        } catch (NameException e) {
            System.out.println("Sorry but: \"" + e.getMessage() + "\"");
        } catch (Throwable e) {
            System.out.println(":)");
            throw new RuntimeException(e);
        }
        System.out.println(":))");
    }
}
