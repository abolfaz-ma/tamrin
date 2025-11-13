import java.util.Scanner;

public class TextInfoPrinter {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        String a = n.nextLine();
        String b = n.nextLine();
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());
    }
}
