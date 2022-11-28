import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n, oddCount=0, evenCount=0;
        n = sc.nextInt();
        int[] arr = new int[n];
        int[] oddArr = new int[n];
        int[] evenArr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0){
                evenArr[evenCount] = arr[i];
                evenCount++;
            }else {
                oddArr[oddCount] = arr[i];
                oddCount++;
            }
        }
        System.out.println("Mang so chan bao gom:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Mang so le bao gom:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.print("\n");
    }
}
