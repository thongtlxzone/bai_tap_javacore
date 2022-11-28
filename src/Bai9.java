import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1(10-99): ");
        int s1 = sc.nextInt();
        System.out.println("Nhap so thu 2(10-99): ");
        int s2 = sc.nextInt();
        if (s1 < 10 || s1 > 99 || s2 < 10 || s2 > 99){
            System.out.println("Nhap sai");
            return;
        }
        int s1_1 = s1%10;
        s1/=s1/10;
        int s1_2 = s1%10;
        int s2_1 = s2%10;
        s2=s2/10;
        int s2_2 = s2%10;
        if(s1_1==s2_1 || s1_1==s2_2 || s1_2==s2_1 || s1_2==s2_2) System.out.println("True");
        else System.out.println("False");
    }
}
