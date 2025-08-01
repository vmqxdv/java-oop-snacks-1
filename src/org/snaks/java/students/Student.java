package org.snaks.java.students;

public class Student {

  private String name;
  private String surname;
  private int age;

  public Student(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public String getStudentData() {
    return String.format("%s %s, %d anni", name, surname, age);
  }
}
