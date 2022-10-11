import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adet,anlikSayi,enBuyuk=0,enKucuk=2147483647;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        adet=input.nextInt();
        for (int i=1;i<=adet;i++){
            System.out.println(i+". Sayıyı Giriniz: ");
            anlikSayi=input.nextInt();
            for (int j = 1;j<=adet;j++) {
                if (enKucuk >= anlikSayi) {
                    enKucuk = anlikSayi;
                }
                if (enBuyuk <= anlikSayi) {
                    enBuyuk = anlikSayi;
                }

            }

        }
        System.out.println("En büyük sayı: "+enBuyuk);
        System.out.println("En küçük Sayı: "+enKucuk);
    }
}