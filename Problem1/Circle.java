 class Circle {
    
    final double pi=3.14159;
   int r;
   public  Circle(int r){
        this.r=r;
    }
     double calculateArea(){
         double m=pi*r*r;
         return m;
     }

    void displayDetails(){
        System.out.println("radius of circle is "+r+"& area of circle is "+calculateArea());

    }


   
}
