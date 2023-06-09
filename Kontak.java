package phone;

import java.util.ArrayList;

public class Kontak {
        String merk;
        String type;
        int pulsa;
        int batteryLevel;
        int status;
        int volume;

    public void addContact ( String nama, String nomor)
{
    if(this.status == 0)
    {
        System.out.println("Ponsel mati. Tidak dapat menambahkan kontak");
    }
    else
    {
        Contact contact = new Contact(nama, nomor);
        daftarKontak.add(contact);
        System.out.println("Contact berhasil ditambahkan");
    }
    }

    ArrayList<Contact> daftarKontak;   public void Cellphone(String merk,String type)
    {
        this.merk = merk;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);  
        this.pulsa = 0;
        this.daftarKontak = new ArrayList<Contact>();
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPulsa() {
        return pulsa;
    }
    public void setPulsa(int pulsa) {
        this.pulsa = pulsa;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public ArrayList<Contact> getDaftarKontak() {
        return daftarKontak;
    }
    public void setDaftarKontak(ArrayList<Contact> daftarKontak) {
        this.daftarKontak = daftarKontak;
    }
}