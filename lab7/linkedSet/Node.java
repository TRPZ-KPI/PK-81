package lab7.linkedSet;

import lab4.Student;

public class Node {
    private Student element;
    private Node next;

    public Node(Student element) {
        this.element = element;
    }

    public void setNext(Node node) {
        next = node;
    }

    public Student getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}
