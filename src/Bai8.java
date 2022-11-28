import java.util.Locale;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ky: ");
        String str = sc.next();
        System.out.println("Ket qua: " + String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1));
    }
}
