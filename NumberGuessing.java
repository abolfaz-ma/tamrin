import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        int t = (int) (Math.random()*50)+1;

        int u= -1;
        int z = 0;
        int q = 0;
        while (u!=t&&q<6){

            u = w.nextInt();
            z = z+1;
            if (u>t){
                System.out.println(",];");
            }
            if (u<t){
                System.out.println("بزرگ تر");
            }

            q=q+1;

        }

        System.out.println(z);

        if (u==t){
            System.out.println("درست است");
        }
        else {
            System.out.println("باخت");
        }
    }
}