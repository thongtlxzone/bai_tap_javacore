import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double ans = Math.log(a)/Math.log(2);
        System.out.println(Math.floor(ans));
    }
}
