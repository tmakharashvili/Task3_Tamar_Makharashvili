import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if(a!=0 && b!=0 && c>=0){
            double mricxveli = Math.pow(a,3) + Math.pow(b,2) - Math.sqrt(c);
            double mnishvneli = a*b+c;
            System.out.println(mricxveli/mnishvneli);
        }
    }
}
