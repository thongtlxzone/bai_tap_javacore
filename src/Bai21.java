import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,x2,v1,v2;
        System.out.println("Nhap vi tri cua kangaroo thu nhat");
        x1 = scanner.nextInt();
        System.out.println("Nhap toc do cua kangaroo thu nhat");
        v1 = scanner.nextInt();
        System.out.println("Nhap vi tri cua kangaroo thu hai");
        x2 = scanner.nextInt();
        System.out.println("Nhap toc do cua kangaroo thu hai");
        v2 = scanner.nextInt();
        if(v2 >= v1) System.out.println("2 con kangaroo se khong gap nhau");
        while (x1<x2){
            x1+=v1;
            x2+=v2;
            if(x1==x2) System.out.println("2 con kangaroo gap nhau");
            else if (x1>x2) System.out.println("2 con kangaroo se khong gap nhau");
        }
    }
}
