import java.util.Scanner;

public class manavProgrami {
    public static void main(String[] args) {
        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        //Örnek Çıktı;
        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL

        double Armut,Elma,Domates,Muz,Patlican;
        Scanner manav= new Scanner(System.in);
        System.out.print("Alınan Armutun Miktarını Giriniz:");
        Armut= manav.nextDouble();
        System.out.print("Alınan Elmanın Miktarını Giriniz:");
        Elma= manav.nextDouble();
        System.out.print("Alınan Domatesin Miktarını Giriniz:");
        Domates= manav.nextDouble();
        System.out.print("Alınan Muzun Miktarını Giriniz:");
        Muz= manav.nextDouble();
        System.out.print("Alınan Patlıcanın Miktarını Giriniz:");
        Patlican= manav.nextDouble();

        double fiyatarmut,fiyatelma,fiyatdomates,fiyatmuz,fiyatpatlican,toplamfiyat;
        fiyatarmut= Armut*2.14;
        fiyatelma=Elma*3.67;
        fiyatdomates=Domates*1.11;
        fiyatmuz=Muz*0.95;
        fiyatpatlican=Patlican*5.0;
        toplamfiyat=fiyatarmut+fiyatdomates+fiyatelma+fiyatmuz+fiyatpatlican;

        System.out.print("TOPLAM ÜCRET:"+toplamfiyat);


    }

}
