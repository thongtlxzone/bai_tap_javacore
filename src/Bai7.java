import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bat ky: ");
        int n = sc.nextInt();
        System.out.println("Cac uoc cua so tren la: ");
        for(int i = 1; i<=n/2; i++){
            if (n%i==0) System.out.print(i + " ");
        }
        System.out.print(n);
    }
}
