import java.util.Random;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Random rand = new Random();
        int RANDOM_NUMBER = rand.nextInt(1000)+1;
        int playerNumber = 0;
        while (playerNumber != RANDOM_NUMBER){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi doan so bi mat: ");
            playerNumber = scanner.nextInt();
            if(playerNumber==RANDOM_NUMBER)
                System.out.println("Chuc mung ban da doan dung");
            else if (RANDOM_NUMBER > playerNumber)
                System.out.println("Sai roi! Ban thu doan so lon hon di^^");
            else
                System.out.println("Sai roi! Ban thu doan so nho hon di^^");
        }
    }
}
