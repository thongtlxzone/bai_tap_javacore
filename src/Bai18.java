import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien a X co hien tai: ");
        double tienHienTai = scanner.nextDouble();
        System.out.println("Nhap so tien a X momg muon: ");
        double tienMongMuon = scanner.nextDouble();
        System.out.println("Nhap Lai suat cua ngan hang: ");
        float tiLeLaiSuat = scanner.nextFloat();
        int month = 0;
        while (tienHienTai < tienMongMuon){
            tienHienTai = tienHienTai + (tiLeLaiSuat/100)*tienHienTai;
            month++;
        }
        System.out.println("Vay so thang anh X phai doi la: "+ month);
    }
}
