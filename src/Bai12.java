import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so(1-9): ");
        int n = sc.nextInt();
        if(n<1 || n>9)return;
        for (int i = 1; i<=n;i++){
            int j = 1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.print("\n");
        }
    }
}
