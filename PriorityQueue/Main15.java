
import java.util.*;



public class Main15 {
    public static void main(String[] args) {
        
    PriorityQueue<Integer> v= new PriorityQueue<>();
    v.add(12);
    v.add(13);
    v.add(14);
    v.add(15);
    v.add(13);
    System.out.println(v);
    System.out.println(v.poll());/* display and delete the first element */
    System.out.println(v);
    System.out.println(v.peek());/*Only display the first element */
    System.out.println(v);
    System.out.println(v.remove());/*remove first element */
    System.out.println(v);
    System.out.println(v.remove(15));/*remove the particular element */
    System.out.println(v);


    }
}
