package org.snaks.java.students;

public class Main {
  public static void main(String[] args) {
    StudentRegister register = new StudentRegister();

    register.addStudent(new Student("Valerio", "Quintilio", 22));
    register.addStudent(new Student("Mario", "Carta", 12));
    register.addStudent(new Student("Marco", "Sanna", 25));
    register.addStudent(new Student("Francesco", "Baldinu", 23));
    register.addStudent(new Student("Luca", "Rossi", 30));
    register.getStudents();
  }

}
