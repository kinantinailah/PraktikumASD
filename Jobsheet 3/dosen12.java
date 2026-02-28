public class dosen12 {
    public String kode;
    public String nama;
    public String jenisKelamin;
    public int usia;   
     
    public dosen12(String kode, String nama, String jenisKelamin, int usia) {
            this.kode = kode;
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.usia = usia;
    }
    public dosen12() {
    }
    public String tampilJenisKelamin() {
        if (jenisKelamin.equalsIgnoreCase("L")) {
            return "Laki-laki";
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            return "Perempuan";
        } else {
            return "Jenis kelamin tidak valid";
        }
    }
}
