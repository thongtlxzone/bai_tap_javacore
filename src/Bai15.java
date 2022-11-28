import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chuoi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Do dai cua chuoi la: " + chuoi.length());
        System.out.println("Moi nhap vi tri xuat ky tu:");
        int index = scanner.nextInt();
        System.out.println("Ky tu tai vi tri vua nhap la: " + chuoi.charAt(index-1));
        if(chuoi.contains("abcdef"))
            System.out.println("Chuoi vua nhap CO chua chuoi phu (abcdef)");
        else
            System.out.println("Chuoi vua nhap KHONG chua chuoi phu (abcdef)");
    }
}
