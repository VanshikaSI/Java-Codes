

/*name,rollno,age
   main for 3 students
   print oldes and youngs
   */

  class Main2 
  {
    public static void main(String[] args){
    Student s1= new Student();
    Student s2=new Student();
    Student s3= new Student();
    s1.age=16;
    s1.name="ram";
    s1.roll=15;
    System.out.println(s1.Name());
    System.out.println(s1.Age());
    System.out.println(s1.RollNo());

    s2.age=18;
    s2.name="shyam";
    s2.roll=17;
    System.out.println(s2.Name());
    System.out.println(s2.Age());
    System.out.println(s2.RollNo());

    s3.age=20;
    s3.name="radha";
    s3.roll=20;
    System.out.println(s3.Name());
    System.out.println(s3.Age());
    System.out.println(s3.RollNo());



if(s1.age>s2.age && s1.age>s3.age){
 System.out.println("Eldest one is "+s1.name);}
 else if(s2.age>s1.age&&s2.age>s1.age){
    System.out.println("Eldest one is"+s2.name);
 }
 else{
    System.out.println("Eldest one is"+s3.name);
 }



 if(s1.age<s2.age && s1.age<s3.age){
 System.out.println("Eldest one is "+s1.name);}
 else if(s2.age<s1.age&&s2.age<s1.age){
    System.out.println("Eldest one is"+s2.name);
 }
 else{
    System.out.println("Eldest one is"+s3.name);
 }
}
}

/*public class Main2 {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Initializing student details
        s1.age = 16;
        s1.name = "Ram";
        s1.roll = 15;

        s2.age = 18;
        s2.name = "Shyam";
        s2.roll = 17;

        s3.age = 20;
        s3.name = "Radha";
        s3.roll = 20;

        // Printing student details
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getRollNo());

        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getRollNo());

        System.out.println(s3.getName());
        System.out.println(s3.getAge());
        System.out.println(s3.getRollNo());

        // Finding and printing the eldest student
        if (s1.age > s2.age && s1.age > s3.age) {
            System.out.println("Eldest one is " + s1.name);
        } else if (s2.age > s1.age && s2.age > s3.age) {
            System.out.println("Eldest one is " + s2.name);
        } else {
            System.out.println("Eldest one is " + s3.name);
        }

        // Finding and printing the youngest student
        if (s1.age < s2.age && s1.age < s3.age) {
            System.out.println("Youngest one is " + s1.name);
        } else if (s2.age < s1.age && s2.age < s3.age) {
            System.out.println("Youngest one is " + s2.name);
        } else {
            System.out.println("Youngest one is " + s3.name);
        }
    }
}*/
