package session7;

public class CounterF1 extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("F1 - "+i);
            try {
                Thread.sleep(100);
            }catch (Exception e){}
        }
        System.out.println("Thread: "+Thread.currentThread().getName());
        // chang name
        Thread.currentThread().setName("Counter F1");
        System.out.println("After change name: "+Thread.currentThread().getName());
        System.out.println("F1 finish");
    }

}
