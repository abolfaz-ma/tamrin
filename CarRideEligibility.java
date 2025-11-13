import java.util.Scanner;

public class CarRideEligibility {
    public static void main(String[] args) {
        Scanner ma =new  Scanner (System.in);
        int j = ma.nextInt();
        while (j<18){
            System.out.println("نمی توانی سور ماشین شوی");
            j++;
        }
    }
}
