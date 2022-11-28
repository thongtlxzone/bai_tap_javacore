import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon;
        do{
            System.out.println("1. Giai PT ax + b = 0");
            System.out.println("2. Giai PT ax^2 + bx + c = 0");
            System.out.println("0. Thoat");
            System.out.println("Moi chon chuc nang: ");
            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    giaiPTBac1();
                    break;
                case 2:
                    giaiPTBac2();
                    break;
                case 0:
                    chon = 0;
                    break;
            }
        }while (chon != 0);
    }

    private static void giaiPTBac2() {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Nhap a:");
        a = scanner.nextDouble();
        System.out.println("Nhap b:");
        b = scanner.nextDouble();
        System.out.println("Nhap c:");
        c = scanner.nextDouble();
        delta = b*b - 4 * a * c;
        if(delta < 0) System.out.println("PT vo nghiem");
        else if (delta == 0) System.out.println("Pt co nghiem kep X =" + (-b/(2*a)));
        else{
            System.out.println("Pt co 2 nghiem phan biet:");
            System.out.println("X1 = " + ( (-b + Math.sqrt(delta)) / (2*a) ));
            System.out.println("X2 = " + ( (-b - Math.sqrt(delta)) / (2*a) ));
        }
    }

    private static void giaiPTBac1() {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("Nhap a:");
        a = scanner.nextDouble();
        System.out.println("Nhap b:");
        b = scanner.nextDouble();
        System.out.println("X = " + (-b/a));
    }
}
