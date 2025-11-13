import java.util.Scanner;

public class KelasYab {

        public static void main(String[]args){
            Scanner KK =  new Scanner(System.in);
            System.out.println("شما در چه کلاسی هستید؟ به عدد ");
            int K = KK.nextInt();
            switch (K){
                case 1:
                System.out.println("برید کلاس 46 ");
                break;
                case 2:
                System.out.println("برید به کلاس 267 ");
                break;
                case 3:
                System.out.println("برید به کلاس 400");
                break;
               case 4:
                System.out.println("برید به کلاس 69 ");
               break;
               default:
                    System.out.println("نادرست");

            }

        }

    }

