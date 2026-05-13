import java.util.Scanner;
public class DoublelinkedList12 {
    Node12 head;
    Node12 tail;

    public DoublelinkedList12() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertafter (String keyNim, Mahasiswa12 data) {
        Node12 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null){
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node12 newNode = new Node12(data);

        if(current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil ditambahkan setelah NIM " + keyNim);
    }

    public void print(){
            if (isEmpty()) {
                System.out.println("Linked List masih kosong.");
                return;
            }
            Node12 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            
        }
    } 
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong.");
        return;
    }
    
    Node12 current = tail;
    System.out.println("Cetak data dari belakang:");
    
    while (current != null) {
        current.data.tampil();
        current = current.prev;
    }
}
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        DoublelinkedList12 list = new DoublelinkedList12();
        int pilihan;

        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisispkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); 

            switch (pilihan){
                case 1:
                    Mahasiswa12 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa12 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa12 dataBaru = inputMahasiswa(scan);
                    list.insertafter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    System.out.println("Data berhasil dihapus.");
                    break;
                case 5:
                    list.removeLast();
                    System.out.println("Data berhasil dihapus.");
                    break;
                case 6:
                    list.print();
                    
                    break;
                case 0: 
                    System.out.println("Program selesai");
                    break;             
                 default:
                    System.out.println("menutidak valid.");
            }

        }while (pilihan != 0);
    }

        public static Mahasiswa12 inputMahasiswa(Scanner scan) {
            System.out.print("Masukkan NIM : ");
            String nim = scan.nextLine();
            System.out.print("Masukkan Nama : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = scan.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = scan.nextDouble();
            scan.nextLine(); 

            return new Mahasiswa12(nim, nama, kelas, ipk);
        
        
}
}
