import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("6");
        arr.add("7");
        arr.add("3");
        arr.add("4");
        arr.add("5");
        arr.add("6");
        System.out.println(arr);/*no need to use for loop to print array */
        ArrayList<String>name=new ArrayList<>();
        name.add("vanshika");
        name.add("riya");
        name.add("rishita");
        name.add("siya");
        name.add("hiya");
        name.add("vanshika");
        System.out.println(name);
        System.out.println(name.lastIndexOf("hiya"));
        System.out.println(name.lastIndexOf("vanshika"));/*last time occured in the list */
        System.out.println(name.get(1));
        name.remove(4);
        System.out.println(name);
      /*  System.out.println("Return value of clone() "+name.clone());
        ArrayList<String>size=(ArrayList<String>name.clone());*/
        
         arr.addAll(name);/*only same type of format will be add */
         System.out.println(arr);/*to add two arraylist */
         System.out.println("is vanshika present in arr ,so the statement is "+arr.contains("vanshika"));/*v.imp- to find a string in arraylist */
         ArrayList<Integer>size=new ArrayList<>();
        size.add(2);
        size.add(23);
        size.add(24);
        size.add(25);
        size.add(26);
        System.out.println(size); 
        boolean result=size.isEmpty();
        System.out.println("is list empty or not = " +result); 
        System.out.println("sublist of size "+size.subList(2, 5));
        ArrayList<Double>even=new ArrayList<>();
        even.add(234d);
        even.add(2348d);
        even.add(25d);
        even.add(2467d);
        System.out.println(even);
        even.sort(Comparator.naturalOrder());

        System.out.println("sorting a array "+even);
         


    }
    
}
