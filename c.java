import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int f = o.nextInt();
        String u = o.next();
        for (int y =0 ; y <f;y++){
            System.out.print("copy of ");
            if (y==5){
                break;
            }
        }
        System.out.print(u);
    }
}
