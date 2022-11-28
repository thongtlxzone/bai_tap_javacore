import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thap phan: ");
        int n = sc.nextInt();
        Stack st = new Stack();
        while(n!=0){
            int i = n%2;
            st.push(i);
            n/=2;
        }
        System.out.println("So nhi phan tuong ung la: ");
        while(!st.isEmpty()){
            System.out.print(st.pop());
        }
    }
}
