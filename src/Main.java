import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // محدوده اعداد در رولت (0 تا 36)
        int min = 0;
        int max = 36;

        // درخواست شرط بندی از کاربر
        System.out.print("Enter your bet number (0-36): ");
        int playerBet = scanner.nextInt();

        // بررسی صحت ورودی کاربر
        if (playerBet < min || playerBet > max) {
            System.out.println("Invalid bet! Please enter a number between 0 and 36.");
            return;
        }

        // چرخاندن چرخ رولت
        int rouletteResult = random.nextInt(max + 1); // تولید عدد تصادفی بین 0 و 36

        // نمایش نتیجه رولت
        System.out.println("Roulette result: " + rouletteResult);

        // بررسی نتیجه شرط بندی
        if (playerBet == rouletteResult) {
            System.out.println("Congratulations! You won.");
        } else {
            System.out.println("Sorry, you lost. Better luck next time!");
        }

        // بستن اسکنر
        scanner.close();

    }
}
