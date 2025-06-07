


class prac1 {
public static void main(String[] args) {
    Operations op= new Operations();
    int result=op.add(1, 2);
    System.out.println(result);
}
    
}

class Operations{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
}
