class Main1{
    public static void main(String[] args)
    {
        Car c=new Car();
       c.setCompany("BMW");
       c.setId(23);
       c.setColor("black");
       c.setSeats(2);

       System.out.println(c.getCompany());
       System.out.println(c.getId());
       System.out.println(c.getColor());
        System.out.println(c.getSeats());

    }
}