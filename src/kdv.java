import java.util.Scanner;

public class kdv {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("kdv'siz fiyat için ücreti yazın?");

    double ana_para= input.nextDouble();

        System.out.println("Kdv'siz tutar:" + ana_para);

        double kdv_orani = 0.18 ;

        double kdv_tutari =  ana_para * kdv_orani ;


        System.out.println( "kdv tutarı:" +kdv_tutari);

        double kdvli_fiyat= kdv_tutari + ana_para;

        System.out.println("kdv'li_fiyat:" + kdvli_fiyat);

        double Hesap = ana_para >1000 ? 0.08 : 0.18 ;

        System.out.println("Kdv tutari aranan kriterlere gore:" + Hesap);



    }
}



