import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int[] arr = new int[99];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        avgArr(arr, n);
        minMaxArr(arr);
        minusMinMax(arr);
        plusMinMax(arr);
        oddEvenArr(arr, n);
        addIndex(arr, n);
        delIndex(arr, n);
    }

    private static void delIndex(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Nhap vi tri muon xoa: ");
        int index = scanner.nextInt();
        index--;
        if(index>n){
            arr[n]=arr[n+1];
            n--; }
        else {
            for(int i = index; i<n; i++){
                arr[i] = arr[i+1];
            }
            n--;
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

    private static void addIndex(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri can add: ");
        int add = scanner.nextInt();
        System.out.println("Nhap vi tri muon add: ");
        int index = scanner.nextInt();
        index--;
        if(index>n){
            arr[n]=add;
            n++; }
        else {
            for(int i = n-1; i>=index; i--){
                arr[i+1] = arr[i];
            }
            arr[index]=add;
            n++;
        }
        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

    private static void oddEvenArr(int[] arr, int n) {
        System.out.println("Cac phan tu chan cua mang la: ");
        for (int i = 0; i<n; i++) {
            if (arr[i] % 2 == 0) System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Cac phan tu le cua mang la: ");
        for (int j = 0; j<n; j++) {
            if (arr[j] % 2 == 1 || arr[j] % 2 == -1) System.out.print(arr[j] + " ");
        }
        System.out.print("\n");
    }

    private static void plusMinMax(int[] arr) {
        int min = 2147483647; // min = gia tri lon nhat cua kieu giu lieu integer
        int max = arr[0];
        for(int i : arr){
            if(i<min && i>0) min = i;
            if(i>max && i>0) max = i;
        }
        System.out.println("Gia tri duong lon nhat cua mang la: "+ max);
        System.out.println("Gia tri duong nho nhat cua mang la: "+ min);
    }

    private static void minusMinMax(int[] arr) {
        int min = arr[0];
        int max = -2147483648; // max = gia tri nho nhat cua kieu giu lieu integer
        for(int i : arr){
            if(i<min && i<0) min = i;
            if(i>max && i<0) max = i;
        }
        System.out.println("Gia tri am lon nhat cua mang la: "+ max);
        System.out.println("Gia tri am nho nhat cua mang la: "+ min);
    }

    private static void minMaxArr(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i : arr){
            if(i<min) min = i;
            if(i>max) max = i;
        }
        System.out.println("Gia tri lon nhat cua mang la: "+ max);
        System.out.println("Gia tri nho nhat cua mang la: "+ min);
    }

    private static void avgArr(int[] arr, int n) {
        double ans = 0;
        for(int i : arr){
            ans+=i;
        }
        System.out.println("Trung binh cong cua mang la: "+(ans/n));
    }
}
