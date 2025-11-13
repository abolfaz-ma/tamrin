package hallo;

import java.util.Scanner;

public class IncomeEvaluator {
    public static void main(String[]args) {
        Scanner d = new Scanner(System.in);
        int e = d.nextInt();
        int a = d.nextInt();
        int l = d.nextInt();
        int eal = e + a + l;
        System.out.println(eal);

        if (eal > 1000) {
            System.out.println("درآمد شما خوب است");


        }
        else if (eal<1000){
            System.out.println("درآمد شما خوب نیست");
        }
    }
}
