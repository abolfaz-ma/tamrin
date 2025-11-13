import java.util.Scanner;

public class InputPrinter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int u = n.nextInt();
        //n.nextLine();
        String[] g=new String[u];
        for (int i=0;i<g.length;i++){
            g[i]=n.next();
        }
        for (int t=0;t<u;t++){
            System.out.println(g[t]);
        }

    }
}
