package session3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Teacher {

    public static void main(String args[]){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("aa");
        stringArrayList.add("bb");
        stringArrayList.add("aa");
        stringArrayList.add("cc");
        System.out.println("In ra Arraylist");
        for(String s: stringArrayList){
            System.out.println(s);
        }
        stringArrayList.remove(0);
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("aa");
        stringHashSet.add("bb");
        stringHashSet.add("aa");
        stringHashSet.add("cc");
        System.out.println("In ra Hashset");
        for (String s: stringHashSet){
            System.out.println(s);
        }
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("le van nam");
        priorityQueue.add("mai van dao");
        priorityQueue.add("do duy hai");
        priorityQueue.add("pham duc chinh");
        priorityQueue.add("an van long");
        System.out.println("In ra priority queue");
//        for (String s: priorityQueue){
//            System.out.println(s);
//        }
        System.out.println("lay ra su sung");
        // Cach lay ra su dung priority queue
        for(;!priorityQueue.isEmpty();){
            System.out.println(priorityQueue.poll());
            System.out.println("kich thuoc: "+priorityQueue.size());
        }
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("phong_cua_Linh","phong 10m2");
        hashMap.put("phong_cua_VA","phong 12m2");
        hashMap.put("phong_cua_Huyen","8m2");
        hashMap.put("phong_cua_Nhan","5m2");
        // key - value
        System.out.println("phong cua ban Linh: "+hashMap.get("phong_cua_Linh"));
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(0,"Xin chao thu 4");
        hashMap1.put(5,"Xin chao thu 7");
        System.out.println(hashMap1.get(5));
    }


    @Override
    public String toString() {
        return "hello world";
    }
}
