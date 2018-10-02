import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ Celsius cần đổi :");
        celsius = sc.nextFloat();
        double fahrenheit = (double) 9 / 5 * celsius + 32;
        System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
    }
}