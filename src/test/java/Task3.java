import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ricxvi1 = scanner.nextInt();
        String moqmedeba = scanner.next();
        int ricxvi2 = scanner.nextInt();

        if (moqmedeba.equals("+")){
            System.out.println(ricxvi1+ricxvi2);
        }else if (moqmedeba.equals("-")) {
            System.out.println(ricxvi1 - ricxvi2);
        }else if (moqmedeba.equals("*")) {
            System.out.println(ricxvi1 * ricxvi2);
        }else if (ricxvi2!=0 && moqmedeba.equals("//")) {
            System.out.println(ricxvi1 / ricxvi2);
        }
        else {
            System.out.println("nulze gayopa ar sheidzleba");
        }
    }
}
