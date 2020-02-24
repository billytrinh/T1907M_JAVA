package session1_demo;

import session1.Car;

public class Toyota extends Car {
   protected int price;
   public Toyota(){

   }
   public Toyota(int year, String typeCar,
                 String brand,int price) {
       super(year,typeCar,brand);
       this.price = price;
   }

    public void showInfo(){
        super.getInfo();
        this.setYear(2003);
        System.out.println("Year: "+year);
    //  System.out.println("Year: "+typeCar);
    // System.out.println("Brand: "+brand);
    }

    public void getInfo(){
       System.out.println("Toyota 2019");
    }

}
