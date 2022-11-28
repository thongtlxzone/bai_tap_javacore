import java.util.Scanner;

public
class TinhTienKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float gioCheckIn, gioCheckOut;
        int soChaiNuoc;
        do{
            System.out.println("Nhap gio vao:");
            gioCheckIn = scanner.nextFloat();
        }while (gioCheckIn>24||gioCheckIn<9);
        do{
            System.out.println("Nhap gio ra:");
            gioCheckOut = scanner.nextFloat();
        }while (gioCheckOut>24||gioCheckOut<gioCheckIn);
        do{
            System.out.println("Nhap so chai nuoc:");
            soChaiNuoc = scanner.nextInt();
        }while (soChaiNuoc<0);
        tinhTien(gioCheckIn,gioCheckOut,soChaiNuoc);
    }

    private static void tinhTien(float gioCheckIn, float gioCheckOut, int soChaiNuoc) {
        float gioHat = gioCheckOut - gioCheckIn;
        double tienThanhToan = 0;
        if(gioHat<=3) tienThanhToan = 30000 * gioHat + soChaiNuoc * 10000;
        if(gioHat>3||gioHat<15) tienThanhToan = 90000 + 0.3*90000*(gioHat-3) + soChaiNuoc * 10000;
        if (gioCheckIn<17&&gioCheckIn>9) tienThanhToan *= 0.8;
        System.out.println("So tien khach hang can tra la: " + tienThanhToan);
    }
}
