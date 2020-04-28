package lab4;

import java.util.Objects;

import lab8.NameException;

public class Student {
    private String name;
    private String surname;
    private String lastName;
    private int age;
    private int course;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, String surname, String lastName, int age, int course) throws NameException {
        if (name.length() == 0) {
            throw new NameException(/*"Name can't be "*/);

//            System.out.println("Name can't be empty.");
        }
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    // todo make smarter
    @Override
    public boolean equals(Object obj) {
        return name.equals(((Student)obj).name);
    }

    // todo tell about
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, lastName, age, course);
    }*/
}
