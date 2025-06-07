import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        ArrayList<Student2> m= new ArrayList<Student2>(); 
    
    int choice ;
    int age;
    String name;
   
    
    do{
        System.out.println("1. Add student");
        System.out.println(" 2. Show student list");
        System.out.println("3. Exit");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice){
            case 1:
             System.out.println("enter Name and Age");
             Scanner s=new Scanner(System.in);
             name=s.next();
             age=s.nextInt();
             Student2 a=new Student2(name,age);
               m.add(a);
             break;
             case 2:
             for(Student2 u:m){
                u.display();
                 }
                  break;            
             

        }
    }while(choice!=3);

}
}
