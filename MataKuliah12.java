public class MataKuliah12 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah12(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah12(){
        this("GJ0712", "ASD", 4, 6);
    }

    public void print() {
        System.out.println("Kode MK: " + this.kodeMK);
        System.out.println("Nama: " + this.nama);
        System.out.println("SKS: " + this.sks);
        System.out.println("Total Jam: " + this.jumlahJam);
    }

    public void changeCredit(int ubahSKS){
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("jam bertambah: " + jam + "menjadi" +this.jumlahJam );
    }

    public void kurangJam (int jam){
        if(this.jumlahJam - jam >= 0){
            System.out.println("jam berkurang: " + jam + "menjadi " + this.jumlahJam);
        }else {
            System.out.println("tidak dapat di lakukan, jam tidak mencukupi");
        }

    }



}
