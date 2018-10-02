import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Tính chu vi hình tròn !!!");
        double cv;
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn :");
        double radius = sc.nextDouble();
        cv = 2 * radius * pi;
        System.out.println("Chu vi hình tròn có bán kính " + radius + " là : " + cv);
        System.out.println("Diện tích hình tròn có bán kính " + radius + " là " + Math.pow(radius, 2));
    }
}