import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        int c = f.nextInt();

        for (int w=0; w<c;w++) {


            for (int a = 0; a < c; a++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
}
