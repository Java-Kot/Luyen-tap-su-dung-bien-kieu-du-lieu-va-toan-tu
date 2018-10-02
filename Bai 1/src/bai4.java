import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào năm sinh :");
        int year = sc.nextInt();
        int age = 2018 - year;
        System.out.println("Tuổi của bạn là : " + age + " tuổi.");
    }
}
