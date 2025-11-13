import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int r = t.nextInt();
        int g = 1;
        for (int n = 1;n<=r;n++){
            g*=n;

        }
        System.out.println(g);
    }
}
