import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[]args){
        Scanner ww = new Scanner(System.in);
        System.out.println("شما در چه سالی متولد شدید");
        int F =ww.nextInt() ;
        if (F <= 1380){
            System.out.println("شما بزرگسال هستید یعنی حداقل بالای 25 سال هستید ");
        }else{
            System.out.println("شما فرد نوجوان هستید یعنی حداکثر زیر 25 سال هسنید ");
        }

    }
}
