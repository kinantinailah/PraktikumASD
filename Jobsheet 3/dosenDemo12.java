import java.util.Scanner;
public class dosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dosen12[] arrayOfDosen = new dosen12[3];
        String kode, nama, jenisKelamin, dummy;
        int usia;
        for(int i=0; i < 3; i++){
            System.out.println("Masukan Data Dosen ke-" + (i+1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin: ");
            jenisKelamin = sc.nextLine();
            System.out.print("Usia         : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------");
            
            arrayOfDosen[i] = new dosen12(kode, nama, jenisKelamin, usia);
           
        }
        for (dosen12 dosen12 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (dosen12.kode));
            System.out.println("Kode         : " + dosen12.kode);
            System.out.println("Nama         : " + dosen12.nama);
            System.out.println("Jenis Kelamin: " + dosen12.jenisKelamin);
            System.out.println("Usia         : " + dosen12.usia);
            System.out.println("------------------------------------");
        }
        
    }
}
    

