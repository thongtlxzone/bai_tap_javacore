import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do diem 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Nhap toa do diem 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Khoang cach giua 2 diem la: "+(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
    }
}
