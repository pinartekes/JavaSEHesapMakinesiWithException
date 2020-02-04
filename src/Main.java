
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarpmaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("\t>İki sayıda çok büyük. Lütfen en fazla 4 basamaklı sayılar giriniz");
    }

}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler = "\t*  >1. Toplama İşlemi   *\n"
                + "\t*  >2. Çıkarma İşlemi   *\n"
                + "\t*  >3. Çarpma İşlemi    *\n"
                + "\t*  >4. Bölme İşlemi     *";
        System.out.println("\t* * * * * * * * * * * * *");
        System.out.println(islemler);
        System.out.println("\t* * * * * * * * * * * * * ");

        try {
        System.out.print(">İşleminizi seçiniz : ");
        int islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("\tToplama İşlemi");
                    System.out.print("\t>Birinci Sayı: ");
                    int a = scanner.nextInt();
                    System.out.print("\t>İkinci Sayı: ");
                    int b = scanner.nextInt();
                    System.out.println("\t>Toplama Sonucu: " + (a + b));
                    break;
                case 2:
                    System.out.println("\tÇıkarma İşlemi");
                    System.out.print("\t>Birinci Sayı: ");
                    int a1 = scanner.nextInt();
                    System.out.print("\t>İkinci Sayı: ");
                    int b1 = scanner.nextInt();
                    System.out.println("\t>Cıkarma Sonucu: " + (a1 - b1));
                    break;
                case 3:
                    System.out.println("\tÇarpma İşlemi");
                    System.out.print("\t>Birinci Sayı: ");
                    int a2 = scanner.nextInt();
                    System.out.print("\t>İkinci Sayı: ");
                    int b2 = scanner.nextInt();
                    if (a2 > 10000 && b2 > 10000) {
                        throw new CarpmaException();
                    }
                    System.out.println("\t>Çarpma Sonucu: " + (a2 * b2));
                    break;
                case 4:
                    System.out.println("\tBölme İşlemi");
                    System.out.print("\t>Birinci Sayı: ");
                    int a3 = scanner.nextInt();
                    System.out.print("\t>İkinci Sayı: ");
                    int b3 = scanner.nextInt();
                    System.out.println("\t>Bölme Sonucu: " + (a3 / b3));
                    break;
                default:
                    System.out.println("\t>Geçersiz İşlem");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\t>Lütfen input'u doğru formatta giriniz");
        } catch (ArithmeticException e) {
            System.out.println("\t>Bir sayı 0'a bölünemez");
        } catch (CarpmaException ex) {
            ex.printStackTrace();
        }
    }
}
