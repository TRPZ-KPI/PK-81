package lab7;

import lab4.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<Student> {

    private static final int INITIAL_ELEMENTS_QUANTITY = 15;

    // todo move creation to constructors
    private Student[] elements = new Student[INITIAL_ELEMENTS_QUANTITY];

    public MySet() {
    }
    public MySet(Student student) {
    }

    public MySet(Collection<Student> students) {

    }

    /**
     * MY super method!!!
     * @return cool value
     */
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
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

    @Override
    public boolean add(Student o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
