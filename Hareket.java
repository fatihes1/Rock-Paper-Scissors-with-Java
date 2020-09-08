import java.util.Random;
public class Hareket {

    public static int choose() {
       // 1 = tas , 2 = kagıt , 3 = makas
        int secim;
        Random rnd=new Random();
        secim=rnd.nextInt(3)+1;
    return secim;
    }

}
