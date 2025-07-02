package org.snaks.java.students;

import java.util.ArrayList;

public class StudentRegister {

  private ArrayList<Student> students;

  public StudentRegister() {
    this.students = new ArrayList<Student>();
  }

  public void getStudents() {
    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getStudentData());
    }
  }

  public void addStudent(Student student) {
    students.add(student);
  }

}
