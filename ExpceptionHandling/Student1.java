import java.util.*;

class Student1 {
 int age;
 String name;
 char gender;/*If you type whole word still it will take first letter as it is char not String. */
 Student1(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name");
 name=sc.next();
 System.out.println("Enter your age");
 age=sc.nextInt();
 try{
 
    if(age>=18){
        System.out.println("enter your gender");
        gender=sc.next().charAt(0);
        System.out.println("Valid age");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);

    }
    else{
        throw new MeExpection("Age is less then 18");
    }
}
catch (MeExpection e) {
    System.out.println("Exception has occured");
    System.out.println(e);
    System.out.println(e.getMessage());
    e.printStackTrace();
}



 }
}

