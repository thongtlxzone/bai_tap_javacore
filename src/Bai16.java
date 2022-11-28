import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap nam: ");
        int year = scanner.nextInt();
        if(year%4==0)
            if(year % 100 == 0 && year % 400 != 0)
                System.out.println("Nam KHONG NHUAN");
            else System.out.println("Nam NHUAN");
        else System.out.println("Nam KHONG NHUAN");
    }
}
