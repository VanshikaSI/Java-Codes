
import java.util.*;



public class Main14 {
    public static void main(String[] args) {
        HashMap<String,Integer> t=new HashMap<>();
     t.put("One",1);
     t.put("Two",2);
     t.put("Three",3);
     t.put("One",11);
     System.out.println("Hash Map: "+t);
     System.out.println("Keys: ");
     for(String key:t.keySet()){
        System.out.println(key);/*set view of keys i.e String */
     }
     System.out.println("Values: ");
     for(Integer values:t.values()){
        System.out.println(values);/*set  view  of values i.e int   */
     }
     int ind=t.get("One");
     System.out.println(ind);

     t.replace("One",1);/*use to replace the current value of key */
     System.out.println(t);
     System.err.println(t.entrySet());/*to grt whole set */

    }

}
