import java.io.FileReader;
import java.io.FileWriter;
/*both are classes mentioned above of java.io */
class Main {
    public static void main(String[] args) {
        String s="HELLO WORLD";
        int ch;
        FileWriter fw=null;
        try {
            fw=new FileWriter("Output.txt");
            for(int i=0;i<s.length();i++){
                fw.write(s.charAt(i));
            }
           fw.close();
            
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        FileReader fr=null;
        try {
            fr =new FileReader("Output.txt");
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
            fr.close();
            
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
}
