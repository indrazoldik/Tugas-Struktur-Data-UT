public class tugas {
    public static void main(String[] args) {
        // 1 Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘StrukturBaris
        int StrukturBaris;
        StrukturBaris = 100;
        System.out.println(StrukturBaris);

        // 2 Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘KataBaru’ yang berisi kata ‘Nama Awal Anda'
        String KataBaru;
        KataBaru = "Indra";
        System.out.println(KataBaru);

        // 3 Buatlah pendeklarasian array satu dimensi dengan nama ‘empatAngka’, tipe data integer, yang berisi angka (2 Digit Nim Awal Anda, 10, 20, 2 Digit Nim AkhirAnda)
        int[] empatAngka = {05, 10, 20, 85};
        System.out.println("Angka pertama: " + empatAngka[0]);
        System.out.println("Angka kedua: " + empatAngka[1]);
        System.out.println("Angka ketiga: " + empatAngka[2]);
        System.out.println("Angka keempat: " + empatAngka[3]);

        // 4 Buatlah pendeklarasian array dua dimensi dengan nama ‘Angka’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut

        String[][] Angka = {
            {"05", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "85"}
        };
        System.out.println("Elemen [0][0]: " + Angka[0][0]);
        System.out.println("Elemen [0][1]: " + Angka[0][1]);
        System.out.println("Elemen [0][2]: " + Angka[0][2]);
        System.out.println("Elemen [1][0]: " + Angka[1][0]);
        System.out.println("Elemen [1][1]: " + Angka[1][1]);
        System.out.println("Elemen [1][2]: " + Angka[1][2]);
        System.out.println("Elemen [2][0]: " + Angka[2][0]);
        System.out.println("Elemen [2][1]: " + Angka[2][1]);
        System.out.println("Elemen [2][2]: " + Angka[2][2]);

        // 5 Buatlah deklarasi linked list dengan nama 'listAngka' yang memiliki list 
        java.util.LinkedList<Integer> listAngka = new java.util.LinkedList<>();
        listAngka.add(05);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(85);
        System.out.println("Isi LinkedList: " + listAngka);
    }
}