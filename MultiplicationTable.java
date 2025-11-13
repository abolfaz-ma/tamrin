import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int w = y.nextInt();
        for (int n = 1;n<=w;n++) {
            for (int b= 1;b<=w;b++){
                System.out.print(b*n+" ");
            }
            System.out.println(" ");
        }
    }
}
