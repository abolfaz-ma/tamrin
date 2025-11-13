import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int i = b.nextInt();
        for (int z=0;z<i;z++){
            for (int v = 0 ;v<=z;v++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }

}