import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int soA = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        int soB = sc.nextInt();
        System.out.println("Tong hai so: " + (soA+soB));
    }
}
