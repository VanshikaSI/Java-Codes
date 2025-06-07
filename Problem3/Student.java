

 class Student {
    final int roll_no;
    static int totalStudent;
    Student(int roll_no){
      this.roll_no=roll_no;
        
        totalStudent++;
       
    }
     int gettotalStudent(){
        return totalStudent;
     }
     void calculateGrade(){
        System.out.println("Grade Calculated");
     }
}
