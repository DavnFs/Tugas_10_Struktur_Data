public class queue1{
    private int ukuran;
    private int[] antrian;
    private int depan, belakang;
    private int nasabah;

    public queue1(int a){
        ukuran = a;
        antrian= new int[ukuran];
        depan = -1;
        belakang = -1;
        nasabah = 0;
    }
    public boolean isEmpty(){
        return belakang == -1;
    }
    public boolean isFull(){
        return belakang == ukuran - 1;
    }
    public void IsItFullEmpty(){
        if(isEmpty() == true){
            System.out.println("Antrean Nasabah Tabung Kosong & Tersedia");
        }
        else if(isFull() == true){
            System.out.println("Antrean Nasabah Tabung Penuh");
        }else if(isFull() == false && isEmpty() == false){
            System.out.println("Antrean Tersedia");
        }
    }
    public void enqueue(){
        if(isEmpty() == true){
            nasabah++;
            depan++;
            antrian[depan] = nasabah;
            belakang++;
            System.out.println("Antrean Baru!!!");
        }else if(isFull() == false){
            nasabah++;
            belakang++;
            antrian[belakang] = nasabah;
            System.out.println("Antrean Baru!!!");
        }else if(isFull() ==true){
            System.out.println("Antrean Penuh");
        }
    }
    public int dequeue(){
        int temp = antrian[0];
        if(isEmpty() == true){
            System.out.println("Antrean Kosong");
            return -1;
        }else{
            for(int i = 0; i <belakang; i++){
                antrian[i] = antrian[i + 1];
            }
            belakang--;
        }
        return temp;
    }
    public void tampilBelakang(){
        System.out.println("Urutan Terakhir Antrean Nasabah Tabung: ");
        if(isEmpty() == true){
            System.out.println("Antrean Nasabah Tabung Kosong");
        }else{
            int terakhir = antrian[belakang];
            System.out.println("Antrean Terakhir "+terakhir);
        }
    }
    public void tampil(){
        System.out.println("Daftar Antrean Nasabah Tabung: ");
        if(isEmpty() == true){
            System.out.println("Antrean Nasabah Tabung Kosong");
        }else{
            System.out.println("+------+");
            System.out.println("| No.  |");
            System.out.println("+------+");
            for (int i = 0; i<= belakang; i++){
                System.out.printf("| %4d |\n", antrian[i]);                }
            System.out.println("+------+");
        }
    }
    public void peek_belakang(){
        System.out.println("Antrian Paling belakang Adalah : "+ antrian[belakang]);
    }
    public void peek_depan(){
        if(isEmpty() == true) {
            System.out.println("Antrean Nasabah Tabung Kosong");
        }else {
            System.out.println("Antrian Paling depan Adalah : " + antrian[depan]);
        }
    }
}