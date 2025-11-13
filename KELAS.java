import java.util.Scanner;

public class KELAS {
    public static void main(String[]args){
        Scanner KK =  new Scanner(System.in);
        System.out.println("شما در چه کلاسی هستید؟ به عدد ");
        int K = KK.nextInt();
        if (K==1){
            System.out.println("برید کلاس 46 ");
        }
        else if (K==2) {
            System.out.println("برید به کلاس 267 ");
        }
        else if (K==3) {
            System.out.println("برید به کلاس 400");
        }
        else if (K==4) {
            System.out.println("برید به کلاس 69 ");
        }else{
            System.out.println("ما فقط تا چهارم داریم ");
        }

        }

}