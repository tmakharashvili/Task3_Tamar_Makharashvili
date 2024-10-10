import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();
        double s = scanner.nextDouble();
        double h = scanner.nextDouble();

        double partobi = Math.PI*r*(r+s);
        System.out.println(partobi);

        double moculoba = (1.0 / 3) * Math.PI * Math.pow(r,2) * h;
        System.out.println(moculoba);
    }
}
