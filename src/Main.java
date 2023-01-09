import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.print("Lütfen Bir Sayi Giriniz: ");
        sayi=input.nextInt();
        double sonuc=0.0;
        for(int i=1 ;i<=sayi; i++)
        {
            sonuc+=(1.0/i);
        }
        System.out.println("Sonuç: "+sonuc);
    }
}