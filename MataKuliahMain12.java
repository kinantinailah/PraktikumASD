public class MataKuliahMain12 {
    public MataKuliahMain12(){
    }

    public static void main(String[] args) {
        MataKuliah12 mk1 = new MataKuliah12();
        MataKuliah12 mk2 = new MataKuliah12("GJ0712", "ASD", 4, 6);
        mk1.print();
        mk2.print();
        mk2.changeCredit(5);
        mk2.tambahJam(2);
        mk2.kurangJam(3);
    }
}
