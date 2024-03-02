import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        int e = 2;
        double res;
        if(x > 0){
            System.out.print("a = ");
            int a = input.nextInt();
            System.out.print("b = ");
            int b = input.nextInt();
            res = 2 * x * x + a * Math.cos(b * x);
        } else {
            res = e + Math.tan(Math.pow(x, 3));;
        }
        System.out.println(String.format("%.2f", res));
    }
}
