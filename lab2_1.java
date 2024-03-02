import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a = scanner.nextDouble();

        System.out.println("b:");
        double b = scanner.nextDouble();

        System.out.println("e:");
        double e = scanner.nextDouble();

        System.out.println("x1:");
        double x1 = scanner.nextDouble();

        System.out.println("x2:");
        double x2 = scanner.nextDouble();

        double y1, y2;

        if (x1 <= 1) {
            y1 = 2 * x1 * x1 + a * Math.cos(b * x1);
        } else {
            y1 = e + Math.tan(Math.pow(x1, 3));
        }

        if (x2 <= 1) {
            y2 = 2 * x2 * x2 + a * Math.cos(b * x2);
        } else {
            y2 = e + Math.tan(Math.pow(x2, 3));
        }

        System.out.printf("f(%f) = %f%n", x1, y1);
        System.out.printf("f(%f) = %f%n", x2, y2);
    }
}