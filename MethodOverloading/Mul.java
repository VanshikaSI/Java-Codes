

 class Mul {
    
    long Multi(int a,int b){
        return a*b;
    }
    long Multi(int a,int b,int c){
        return a*b*c;
    }
    long Multi(int...a){
        int multi=1;
        for(int i:a){
            multi=multi*i;
        }
        return multi;
    }
    
}
