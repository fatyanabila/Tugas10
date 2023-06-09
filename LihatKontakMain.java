package phone;

public class LihatKontakMain {
    public static void main(String[] args)
    {
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.tambahKontak("Dino", "08183745237");
        cp.tambahKontak("Jeje", "08919873786");
        cp.lihatKontak();
        cp.cariKontak("Jeje");
        cp.cariKontak("Fikri");
        //cp.topUpPulsa(5000);
        cp.lihatSisaPulsa();
        //cp.volumeUp();
        cp.powerOff();
        cp.cariKontak("Jeje");
        //cp.lihatKontak();
        //cp.topUpPulsa(10000);
        cp.lihatSisaPulsa();
        //cp.volumeUp();
    }
}
