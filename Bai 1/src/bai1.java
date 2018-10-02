import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float vl, hh, sh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm Vật Lý :");
        vl = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm Hóa Học :");
        hh = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm Sinh Học :");
        sh = sc.nextFloat();
        float dtb = (vl + hh + sh) / 3;
        System.out.println("Điểm trung bình cộng là : " + dtb);
        float tong = vl + hh + sh;
        System.out.println("Tổng điểm là : " + tong);
    }
}