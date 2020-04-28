package lab7.linkedSet;

import lab4.Student;
import lab6.CorrespondenceStudent;
import lab8.NameException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyLinkedSet implements Set<Student> {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedSet() {
    }

    public MyLinkedSet(Student student) {
    }

    public MyLinkedSet(Collection<Student> students) {

    }

    /**
     * MY super method!!!
     *
     * @return cool value
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement().equals(o)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     *
     * @param o
     * @return
     * @throws NameException no Oleksii allowed
     */
    @Override
    public boolean add(Student element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        /*Object o2 = "";
        String s = (String) o2;*/
        if (o instanceof CorrespondenceStudent) {
            throw new ClassCastException();
        }
        if (((Student)o).getName().equals("Oleksii")) {
            throw new NameException("No Oleksii!");
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
