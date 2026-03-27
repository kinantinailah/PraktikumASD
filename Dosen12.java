public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen12 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    public Dosen12(){
        this("GJ0712", "jotaru", true, 2024, "Komputer");
    }
    public void tampilinformasi(){
        System.out.println("ID Dosen: " + this.idDosen);
        System.out.println("Nama: " + this.nama);
        System.out.println("Status Aktif: " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + this.tahunBergabung);
        System.out.println("Bidang Keahlian: " + this.bidangKeahlian);
    }
    public void setStatusAktif(boolean status){
        this.statusAktif = status;
        System.out.println("Status aktif dosen " + this.nama + " diubah menjadi: " + (this.statusAktif ? "Aktif" : "Tidak Aktif"));
    }
    
}
