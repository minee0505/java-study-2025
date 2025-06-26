package chap1_3.constructor;

public class Student {
    int studentId;
    String name;
    int grade;


    Student(int id, String sName, int sGrade) {
        studentId = id;
        name = sName;
        grade = sGrade;
    }

    void updateGrade(int newGrade) {
        grade = newGrade;
    }

    void printStudentInfo() {
//      System.out.println("studentId = " + studentId + ", name = " + name + ", grade = " + grade);
        System.out.printf("studentId = %d, name = %s, grade = %d\n", studentId, name, grade);

    }

    public static void main(String[] args) {
        Student student = new Student(2019215, "kim", 3);
        student.updateGrade(5);
        student.printStudentInfo();

    }
}
