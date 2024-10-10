import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountUSD = scanner.nextDouble();
        double exchangeRate = scanner.nextDouble();
        double feePercentage = scanner.nextDouble();

        double receivedEUR = amountUSD * exchangeRate * (1 - (feePercentage/100));
        System.out.println("misaghebi tanxa evroshi aris " + receivedEUR);
    }
}
