import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a = scanner.nextDouble();

        System.out.println("n:");
        int n = scanner.nextInt();

        double S = 0;
        double x = 1;

        for (int i = 0; i < n; i++) {
            if (x >= 1 && x < 2) {
                S += Math.atan2(2, x * x + a) + Math.atan(-1) + Math.atan(2 * (x - 1) * (x - 1) - 1);
            }
            x += 1.0 / n;
        }

        System.out.printf("Значение S после итераций %d = %.10f%n", n, S);
    }
}