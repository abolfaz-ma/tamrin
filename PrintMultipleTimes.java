import java.util.Scanner;

public class PrintMultipleTimes {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int i = y .nextInt();
        int k = y.nextInt();
        int d = 0;
        while (d<k){
            d++;
            System.out.println(i);
        }
    }
}
