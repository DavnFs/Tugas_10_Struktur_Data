public class queue2 {
    int ukuran; //untuk mengatur ukuran array
    int[] antrian; //untuk array dengan ukuran tertentu
    int depan, belakang, jumlahantrian, nasabah; //pointer dan posisi/jumlah


    //blueprint class queue
    public queue2(int s){
        ukuran = s;
        antrian = new int [ukuran];
        depan = -1;
        belakang = -1;
        jumlahantrian = 0; //untuk menghitung jumlah antrian
        nasabah = 0;
    }

    //cek apakah antrian kosong
    //Bernilai True apabila array kosong
    public boolean isEmpty(){
        return(depan == -1);
    }
    //Cek apakah antrian penuh, bernilai True jika array penuh
    public boolean isFull(){
        return(belakang==ukuran -1);
    }
    //Untuk memasukan sebuah antrian
    public void enqueue(){
        if (isEmpty() == true){
            nasabah ++;
            depan ++;
            antrian[depan] = nasabah;
            belakang++;
        }
        else if (isEmpty() == false){
            nasabah ++;
            belakang++;
            antrian[belakang] = nasabah;
        }
        else{
            System.out.println("Antrian Penuh");
        }
    }
    public int dequeue(){
        int temp = antrian[0];
        for (int i=0; i <= belakang; i++ ){
            antrian[i] = antrian [i+1];
        }
        belakang--;
        return temp;
    }
    public void tampil(){
        System.out.println("Daftar Antrian : ");
        for(int i = 0; i<=belakang; i++){
            System.out.println("" + antrian[i]);
        }
        System.out.println("");
    }
    public void peek_belakang(){
        System.out.println("Antrian Paling belakang Adalah : "+ antrian[belakang]);
    }

    public void peek_depan(){
        System.out.println("Antrian Paling depan Adalah : " + antrian[depan]);
    }
}
