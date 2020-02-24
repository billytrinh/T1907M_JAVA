package session2;

public class AptechStudent extends Student implements StudentInterface{
    @Override
    public void showInfo() {
        System.out.println("hello Student");
    }

    @Override
    public void study() {

    }

    @Override
    public void playGame() {

    }

    public void sleep(){

    }

    public void running(){

    }

    @Override
    public int getAge() {
        return 0;
    }


}
