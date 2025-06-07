class Topper extends Student{

    private int marks;
    Topper(int rollno,String name,char div,int marks)
    {
        super(rollno,name,div);
        this.marks=marks;
    }
    int getMarks(){
        return this.marks;
    }

}