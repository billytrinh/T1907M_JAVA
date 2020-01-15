package session1;

public class Car {
    protected int year = 2015;
    protected String typeCar = "Autocar";
    protected String brand = "Auto";
    public Car(){
    }

    public Car(int year, String typeCar,
               String brand) {
        this.year = year;
        this.typeCar = typeCar;
        this.brand = brand;
    }

    public void getInfo(){
        System.out.println("Brand: "+brand);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
