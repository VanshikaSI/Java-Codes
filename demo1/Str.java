

package demo1;

import java.util.Scanner;

public class Str {
    String s1 = "Java Programming";
    String s2 = new String("C Programming");
    String s3;

    public void input() {
        System.out.println("Enter the value of string");
        Scanner s = new Scanner(System.in);
        s3 = s.next();
    }

    public void logic() {
        System.out.println("concate string" + s1.concat(s2));

        System.out.println("Lenght of String=" + (int) (s2.length()));

        System.out.println("upper case=" + s1.toUpperCase());
        System.out.println("lower case" + s1.toLowerCase());

        System.out.println("replace case" + s1.replace("Java", "Python"));
    }}