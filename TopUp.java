package phone;
import java.util.Scanner;

public class TopUp {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String NoHp;
        String Operator;
        String nama_paket;
        int pilih;
        int TopUp;
        int pilih_pulsa;
        int harga = 0;

        System.out.println("Nomor Handphone : ");
        NoHp = input.nextLine();
        switch(NoHp)
        {
            case "081" : 
                Operator = "Telkomsel";
                break;

            case "085" :
                Operator = "Indosat";
                break;
                
            case "087" :
                Operator = "XL";
                break;
            default:
                Operator = "Nomor Operator Tidak ada";
        }

        System.out.println("OPerator : "+Operator);
        System.out.println("1. Top Up Pulsa\n0.Keluar");

        System.out.println("Silahkan Pilih : ");
        pilih = input.nextInt();
        switch (pilih)
        {
            case 1 :
                System.out.println("TOP UP");
                System.out.println("1. Rp.5000\n2. Rp.10000\n3. Rp.15000\n4. Rp.20000");
                System.out.println("Masukkan Pilihan Anda : ");
                pilih_pulsa = input.nextInt();
                switch (pilih_pulsa)
                {
                    case 1 :
                        harga = 5000;
                        break;

                    case 2 :
                        harga = 10000;
                        break;

                    case 3 :
                        harga = 15000;

                    case 4 :
                        harga = 20000;
                        break;
                }
            break;
        }

        System.out.println("Pembelian Berhasil");
        System.out.println("Nomor Handphone : "+NoHp);
        System.out.println("Operator : "+Operator);
        //System.out.println("Transaksi : "+harga+"\t"+nama_paket);
    }
}