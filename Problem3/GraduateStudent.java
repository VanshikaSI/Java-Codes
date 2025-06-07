



class GraduateStudent extends Student {
    String subject ;

    GraduateStudent(int roll_no,String subject) {
        super(roll_no);
        this.subject=subject;
    }

    void calculateGrade() {
        System.out.println("Grade Calculated based on graduate criteria for roll number:" + roll_no);
    }
    void calculateGrade(String subject){
        System.out.println("Grade of subject "+subject+" calculated for rollno: "+roll_no);
    }
}