package hallo;

import java.util.Scanner;

public class jk {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String a = i.nextLine();
        int b =0;
        //System.out.println(a.length());
        for (int c =0;c<a.length();c++){
            if (a.charAt(c)!=' '){
                b++;
            }
        }
        String[] f=a.trim().split("\\s+");
        int d=f.length;
        boolean r= false ;
        for (String e : f){
            if (e.equals("slam")){
                r=true;
                break;
            }
        }


    }
}
