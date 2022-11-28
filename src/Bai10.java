import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int tong = 0,n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            tong += i;
        }
        System.out.println("Ket qua: " + tong);
    }
}
