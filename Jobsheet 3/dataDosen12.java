public class dataDosen12 {
   public void dataSemuaDosen(dosen12[] arrayOfDosen) {
         int no = 1;
        for (dosen12 dosen : arrayOfDosen) {
            System.out.println("Data dosen ke-" + no++);
            System.out.println("Kode Dosen    : " + dosen.kode);
            System.out.println("Nama Dosen    : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + dosen.tampilJenisKelamin());
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("----------------------------------");
        }

    }
    public void jumlahPerJenisKelamin(dosen12[] arrayOfDosen) {
        int jumlahLk = 0;
        int jumlahPr = 0;
        for (dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("L")) {
                jumlahLk++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("P")) {
                jumlahPr++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki : " + jumlahLk);
        System.out.println("Jumlah Dosen Perempuan : " + jumlahPr);
    }
    public void rataRataUsia(dosen12[] arrayOfDosen) {
        int totalLk = 0;
        int totalPr = 0;
        int jumlahLk = 0;
        int jumlahPr = 0;
         
        for (dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("L")) {
                totalLk += dosen.usia;
                jumlahLk++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("P")) {
                totalPr += dosen.usia;
                jumlahPr++;
            }
        }
        double rataRataLk = jumlahLk > 0 ?  totalLk / jumlahLk : 0;
        double rataRataPr = jumlahPr > 0 ?  totalPr / jumlahPr : 0;
        System.out.println("Rata-rata Usia Dosen Laki-laki : " + rataRataLk);
        System.out.println("Rata-rata Usia Dosen Perempuan : " + rataRataPr);
    }
    public void dataDosenTertuaTermuda(dosen12[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Tidak ada data dosen.");
            return;
        }
        dosen12 dosenTertua = arrayOfDosen[0];
        dosen12 dosenTermuda = arrayOfDosen[0];
        for (dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen Tertua:");
        System.out.println("Kode Dosen    : " + dosenTertua.kode);
        System.out.println("Nama Dosen    : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin : " + dosenTertua.tampilJenisKelamin());
        System.out.println("Usia          : " + dosenTertua.usia);
        System.out.println("----------------------------------");
        
        System.out.println("Dosen Termuda:");
        System.out.println("Kode Dosen    : " + dosenTermuda.kode);
        System.out.println("Nama Dosen    : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin : " + dosenTermuda.tampilJenisKelamin());
        System.out.println("Usia          : " + dosenTermuda.usia);
        System.out.println("----------------------------------");
    }
}