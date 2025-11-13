import java.util.Scanner;

public class WeekdayIdentifier {
    public static void main(String[]args){
        Scanner ff = new Scanner(System.in);
        System.out.println("سلام");
        int tt =ff.nextInt();
        switch (tt){
            case 1:
                System.out.println("امروز اول هفته است");
                break;
            case 2:
                System.out.println("امروز روز دوم هفته است");
                break;
            case 3:
                System.out.println("امروز روز سوم هفته است");
                break;
            case 4:
                System.out.println("امروز روز چهارم هفته است");
                break;
            case 5:
                System.out.println("امروز روز پنجم هفته است");
                break;
            case 6:
                System.out.println("امروز روز ششم هفته است");
                break;
            default:
                System.out.println("نادرست");

        }
    }
}

