public class DosenMain12 {
    public DosenMain12(){
    }

    public static void main(String[] args) {
        Dosen12 dosen1 = new Dosen12();
        Dosen12 dosen2 = new Dosen12("GJ0712", "jotaru", true, 2024, "Komputer");
        dosen1.tampilinformasi();
        dosen2.tampilinformasi();
        dosen2.setStatusAktif(false);
    }
}
