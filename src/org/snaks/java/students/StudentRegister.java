package org.snaks.java.students;

import java.util.ArrayList;

public class StudentRegister {

  private Student[] studentRegister;

  public StudentRegister() {
    this.studentRegister = new Student[0];
  }

  public Student[] getStudentRegister() {
    return this.studentRegister;
  }

  public void setStudentRegister(Student[] studentRegister) {
    this.studentRegister = studentRegister;
  }

  public void addStudent(Student student) {
    Student[] newStudentRegister = new Student[this.studentRegister.length + 1];

    for (int i = 0; i < this.studentRegister.length; i++) {
      newStudentRegister[i] = this.studentRegister[i];
    }

    newStudentRegister[newStudentRegister.length - 1] = student;

    this.studentRegister = newStudentRegister;
  }

  public String toString() {
    String result = "Registro degli studenti:\n";

    for (Student student : this.studentRegister) {
      result += String.format("%s\n", student.getStudentData());
    }

    return result;
  }

}
