package lab_s4;

import sun.tools.jstat.Scale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Mobile <S,T,N> {
    public S brandName;
    public T seri;
    public N year;

    public Mobile() {
    }

    public Mobile(S brandName, T seri, N year) {
        this.brandName = brandName;
        this.seri = seri;
        this.year = year;
    }

    public S getBrandName() {
        return brandName;
    }

    public void setBrandName(S brandName) {
        this.brandName = brandName;
    }

    public T getSeri() {
        return seri;
    }

    public void setSeri(T seri) {
        this.seri = seri;
    }

    public N getYear() {
        return year;
    }

    public void setYear(N year) {
        this.year = year;
    }

    public boolean checkGuarantee(){
        //LocalDate madeYear = LocalDate.of((Integer) year,1,1);// -> tao ra 1 object cua localdate lấy theo ngayf thang trong may tinh
        LocalDate now = LocalDate.now();
        if((Integer) year < (now.getYear()-5)){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        // Java Time
        LocalDate lc = LocalDate.now(); // ngay hien tai
       // LocalDate lc2 = LocalDate.of(2019,2,29);// loi vi ko co ngay 29-2-2019 // tao ngay bang nam thang ngay chinh xac
        LocalDate lc3 = LocalDate.of(2020,2,29); // tao ngay bang nam thang ngay chinh xac
        LocalDate lc5 = lc3.minusYears(1);
        System.out.println("lC5: "+lc5);
        LocalDate lc4 = LocalDate.parse("2019-04-22");// ra ngay chinh xac bang chuoi chuan iso yyyy-mm-dd

        LocalDateTime dt = LocalDateTime.now();// ngay gio hien tai
        System.out.println(dt);
        LocalDateTime dt2 = LocalDateTime.of(2020,1,30,12,30,45); // ngay gio chinh xac
        //                                 year,month,day,hour,min,second
        LocalDateTime dt3 = LocalDateTime.parse("2020-02-28T11:16:19.687");

        // vi du kiem tra 1 nam nao do co phai nam nhuan hay ko
        System.out.println("nhap nam can kiem tra");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        LocalDate kt = LocalDate.of(x,2,28);
        LocalDate nextDay = kt.plusDays(1);
        if(nextDay.getDayOfMonth() == 29){
            // nam nhuan
        }

    }
}
