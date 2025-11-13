import java.util.Scanner;

public class RandomGuessGame {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = (int) (Math.random() * 10) + 1;
        System.out.println("یک عدد بین 1 تا 10 حدس بزن");
        int b=0;
        int c=1;
        while (a!=b) {
            b= n.nextInt();
            c=c*b;
            if (a==b){
                break;
            }
            System.out.println("ین");
            if (b>a){
                System.out.println("عدد کوچکتر حدس بزن");
            }
            if (b<a){
                System.out.println("عدد بزرگتر حدس بزن");
            }
        }
        System.out.println(c);



    }

    }
