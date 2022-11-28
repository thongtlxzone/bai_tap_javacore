import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
//        for(int i = 1; i <= 15; i++){
//            if(i % 2 == 1 && i <= 9) System.out.println("* * * * * * ==================================");
//            else if(i % 2 == 0 && i <= 9) System.out.println(" * * * * *  ==================================");
//            else System.out.println("==============================================");
//        }
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5 - 1; i++)
            for (int j = 0; j < 5 - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}