import java.util.Scanner;


public class cinZodyagiOdev {
    public static void main(String[] args) {


        int year, kalan;

        Scanner input = new Scanner(System.in);

        System.out.print("doğum yılını giriniz :");
        year = input.nextInt();

        kalan = year % 12;

        switch (kalan) {

            case 0:
            System.out.print("Burcunuz Maymun.");
            break;
            case 1:
                System.out.print("Burcunuz Horoz.");
            break;
            case 2:
                System.out.print("Burcunuz Köpek.");
            break;
            case 3:
                System.out.print("Burcunuz Domuz.");
            break;
            case 4:
                System.out.print("Burcunuz Fare.");
                break;
            case 5:
                System.out.print("Burcunuz Öküz.");
                break;
            case 6:
                System.out.print("Burcunuz Kaplan.");
                break;
            case 7:
                System.out.print("Burcunuz Tavşan.");
                break;
            case 8:
                System.out.print("Burcunuz Ejderha.");
                break;
            case 9:
                System.out.print("Burcunuz Yılan.");
                break;
            case 10:
                System.out.print("Burcunuz At.");
                break;
            case 11:
                System.out.print("Burcunuz Koyun.");
                break;
            default:
                System.out.print("Geçersiz değer girdiniz!");
        }

        System.out.print(kalan);




    }
}
