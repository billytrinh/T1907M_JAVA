package session4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]){
        Generic g = new Generic();
        g.showMessage("Good Morning!");
        g.showMessage(18);
        g.showMessage(g);

        Generic<String,Integer> g2 = new Generic<>();
        g2.setName("quanghoa");
        g2.setPhone(98888888);

        Generic<Integer,Double> g3 = new Generic<>();
        g3.setName(12);
        g3.setPhone(33.12);

        ArrayList<String> arrayList;
        HashSet<Double> doubles;
        PriorityQueue<String> stringPriorityQueue;
        HashMap<String, Integer> stringIntegerHashMap;

        ArrayList ar = new ArrayList();
        // up casting --> ép kiểu ngược lên
        // down casting --> ép kiểu xuôi xuống
        // Class B extends A
        // B obj -> casting sang kieu A --> up casting
        // A obj -> casting sang kieu B --> down casting

    }

}

