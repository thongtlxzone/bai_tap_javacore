import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = scanner.next();
        String ketQua = "";
        int doDaiKetQua = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if(chuoi.length()%2==0){
                int left = i;
                int right = i+1;
                while (left >= 0 && right < chuoi.length() && chuoi.charAt(left) == chuoi.charAt(right)) {
                    if (right - left + 1 > doDaiKetQua)
                        ketQua = chuoi.substring(left, right + 1);
                    doDaiKetQua = right - left + 1;
                    left--;
                    right++;
                }
            }else {
                int left = i;
                int right = i;
                while (left >= 0 && right < chuoi.length() && chuoi.charAt(left) == chuoi.charAt(right)) {
                    if (right - left + 1 > doDaiKetQua)
                        ketQua = chuoi.substring(left, right + 1);
                    doDaiKetQua = right - left + 1;
                    left--;
                    right++;
                }
            }
        }
        System.out.println(ketQua);
    }
}
