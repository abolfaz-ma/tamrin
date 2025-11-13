package hallo;

import java.util.Scanner;

public class nowbat {
    public static void main(String[]args) {
        Scanner sf = new Scanner(System.in);
        int s = sf.nextInt();
        if (s>=1&&s<=15){
            System.out.println("بفرما اخر");
        }
        else if (s>=15&&s<=20){
            System.out.println("بفرما بالا");
        }
        else if (s>=20&&s<=30){
            System.out.println("بفرما جلو");
        }
        else if (s>=30){
            System.out.println("بفرما وسط");
        }

    }
}
