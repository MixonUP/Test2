package java.model;

import java.util.Objects;

public class Student {

    private String firstname;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private int tuitionBalance;

    public Student(String firstname, String lastName, int gradeYear, String studentID, int tuitionBalance) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.gradeYear = gradeYear;
        this.studentID = studentID;
        this.tuitionBalance = tuitionBalance;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getTuitionBalance() {
        return tuitionBalance;
    }

    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeYear=" + gradeYear +
                ", studentID='" + studentID + '\'' +
                ", tuitionBalance=" + tuitionBalance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gradeYear == student.gradeYear && tuitionBalance == student.tuitionBalance && Objects.equals(firstname, student.firstname) && Objects.equals(lastName, student.lastName) && Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, gradeYear, studentID, tuitionBalance);
    }
}