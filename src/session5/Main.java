package session5;

import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception{
        int x = 0;
        int y = 10;
        try {
            int z = x/y;// z = 0;
            System.out.println(z);
            // cho nay chua bi loi
          //  if(x<=0) throw new Exception("Loi mat roi, khong lam tiep duoc");// chu dong cho crash app
            System.out.println("in nguoc xem sao.");
            z = y /x; // loi o day <---
            System.out.println(z);
        }catch (Exception e){
            System.out.println("loi mat roi");
        }finally {
            System.out.println("Luc nao cung chay qua");
        }
        //CRASH APP

        // vẫn biên dịch được vì ko sai cú pháp
        // ko phai loi o bien dich ma loi o runtime
        // nhap 2 so tu ban phim -> in ra thuong cua 2 so do
        try {
            File f = new File("/Users/macbook/Desktop/data.txt");
            String st= "";
            if(f.canRead()){
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                st = dis.readLine();
                System.out.println(st);
                dis.close();
                fis.close();
            }
            if(f.canWrite()){
                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeChars(st+"Xin chao, day la dong dau tien\n");
                dos.close();
                fos.close();
            }
        }catch (Exception $e){
            System.out.println("khong tim thay file hoac khong the su dung");
        }


    }
}
