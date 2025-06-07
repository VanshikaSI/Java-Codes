

public class Main {
    public static void main(String[] args) {
        Student.totalStudent=0;
        Student s=new Student(123);
        s.calculateGrade();
        GraduateStudent g= new GraduateStudent(12, "Physics");
        g.calculateGrade();
        g.calculateGrade("Physics");
       
        GraduateStudent g1= new GraduateStudent(13, "Physics");
        g1.calculateGrade();
        g1.calculateGrade("Physics");
        System.out.println(Student.totalStudent);
    }
}
