package session1;

import session1_demo.Toyota;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
//        Human h = new Human(15);
//        System.out.println("tuoi: "+h.age);
//        h.getInfo();
//        Car c = new Car();
//        c.setYear(1999);
//        System.out.println("Year: "+c.getYear());
//        System.out.println("Type: "+c.typeCar);
//        //System.out.println("Type: "+c.brand);
//        Car c2 = new Car();
//        c2.setYear(2000);

        // Demo lab
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap canh 1:");
            a = sc.nextInt();
            System.out.println("Nhap canh 2:");
            b = sc.nextInt();
            System.out.println("Nhap canh 3:");
            c = sc.nextInt();
        }while (!checkTamGiac(a,b,c));
        TamGiac tg = new TamGiac(a,b,c);
        System.out.println("Chu vi: "+tg.chuVi());
        System.out.println("Dien tich: "+tg.dienTich());
        Human ah = new Human();
        ah.getInfo(5,7);
        Toyota ty = new Toyota();
        ty.getInfo();
    }

    public static boolean checkTamGiac(int a,int b,int c){
        if(a+b >c && a+c>b && b+c>a) return true;
        return false;
    }
}
