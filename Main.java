import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

        public static String isimAl() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Oyuncunun ismini giriniz : ");
            String isim = scanner.next();
            return isim;
        }

    public static void main(String[] args) {
        System.out.println("Fatih ES \n18360859021 \n------------------------------------");
        String isim1,isim2;
            isim1 = isimAl();
            isim2 = isimAl();

	    Kisi kisi1 = new Kisi(isim1);
	    Kisi kisi2 = new Kisi(isim2);
        // 1 = tas , 2 = kagıt , 3 = makas olarak kabul edildi.
	    for ( int i = 0 ; i<100; i++  ) {
            kisi1.secim = Hareket.choose();
            kisi2.secim = Hareket.choose();
            if(kisi1.secim==kisi2.secim)
            {
                System.out.println((i+1) +". Tur Berabere");
                kisi1.puan++;
                kisi2.puan++;
            }
            if(kisi1.secim==1 &&kisi2.secim==2)
            {
                System.out.println((i+1) +". Turu "+ isim2 +" kazandı.");
                kisi2.puan += 2;
            }
            if(kisi1.secim==1 && kisi2.secim==3)
            {
                System.out.println((i+1) +". Turu "+ isim1 +" kazandı.");
                kisi1.puan +=2;
            }
            if(kisi1.secim==2 && kisi2.secim==1)
            {
                System.out.println((i+1) +". Turu "+ isim1 +" kazandı.");
                kisi1.puan+=2;
            }
            if(kisi1.secim==2 && kisi2.secim==3)
            {
                System.out.println((i+1) +". Turu "+isim2+" kazandı.");
                kisi2.puan+=2;
            }
            if(kisi1.secim==3 && kisi2.secim==1)
            {
                System.out.println((i+1) +". Turu "+isim2+" kazandı.");
                kisi2.puan+=2;
            }
            if(kisi1.secim==3 && kisi2.secim==2)
            {
                System.out.println((i+1) +". Turu "+isim1+" kazandı.");
                kisi1.puan+=2;
            }
        }



	    System.out.println("SONUC : "+isim1+ " : "+ kisi1.puan + "  Puan  \t "+isim2 +" : " + kisi2.puan + " Puan");
        if (kisi1.puan == kisi2.puan) {
            System.out.println(" OYUN BERABERE SONUCLANDI !");
        }
        else if (kisi1.puan>kisi2.puan) {
            System.out.println( isim1+ " OYUNUN GALİBİ OLDU !");
        }
        else {
            System.out.println(isim2+" OYUNUN GALIBI OLDU !");
        }



    }
}
