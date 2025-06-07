import java.util.*;

class Main13{
 public static void main(String[] args) {
     HashSet<String>set=new HashSet<>();
     set.add("Vanshika");
     set.add("Rishita");
     set.add("Shivansh");
     set.add("Siya");
     set.add("Vanshika");
     System.out.println("set : "+set);
     HashSet<String>n=new HashSet<>();
    n.add("Vanshika");
     n.add("Riya");
     n.add("Miya");
     n.add("Hiya");
     n.add("vanshika");
     System.out.println("set : "+n);
     set.addAll(n);
     System.out.println(set);
 
    
    /*for removing common element use .removeAll--for only set not for n */
   set.removeAll(n);
   System.out.println(set);
   /*Intersection */
   set.retainAll(n);
   System.out.println(set);
   System.out.println(set.contains("Rishita"));


 }
}