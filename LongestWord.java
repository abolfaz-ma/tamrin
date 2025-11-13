import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        String[] m =new String[a];
        for (int b=0;b<a;b++){
            m[b] = o.next();
        }
        String max=m[0];
        for (int e=0;e<a;e++){
            if (m[e].length()>max.length()){
                max=m[e];

            }

        }
        System.out.println(max);
    }
}
