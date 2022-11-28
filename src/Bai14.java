import java.util.Arrays;
import java.util.Scanner;

public class Bai14 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        for (int i = 1; i < n; ++i) {
            if (arr[i] != arr[answer]) {
                ++answer;
                arr[answer] = arr[i];
            }
        }
        for(int i = 0; i < answer+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
