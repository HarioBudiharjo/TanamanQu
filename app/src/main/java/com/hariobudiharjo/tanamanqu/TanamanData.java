package com.hariobudiharjo.tanamanqu;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//http://tanamtanaman.com/macam-macam-tanaman-hias/
public class TanamanData {

    public static String[][] data = new String[][]{
            {"1", "BUNGA ANGGREK", "Anggrek merupakan tanaman hias bunga yang cukup populer di Indonesia. Bunga anggrek sering dipergunakan sebagai ungkapan rasa cinta, simbol kemewahan dan keindahan selama ratusan tahun. Bunga yang masuk ke dalam suku Orchidaceae ini mempunyai banyak sekali varietas dengan keindahan yang dibawa masing-masing variasinya.", "anggrek"},
            {"2", "BUNGA MAWAR", "Bunga mawar diberi julukan sebagai “Ratu Bunga” dikarenakan mempunyai keindahan dan keunikan yang khas. Bentuk yang indah pada kelopak bunga mawar didukung dengan aromanya yang menarik. Selain anggrek, tanaman hias bunga mawar juga diindentikan dengan simbol perasaan cinta terhadap seseorang.", "mawar"},
            {"3", "BUNGA MELATI", "Melati digolongkan sebagai tumbuhan perdu yang termasuk ke dalam macam-macam tanaman hias bunga. Tanaman merambat yang terdiri dari sekitar 200 spesies ini tumbuh dengan subur di daerah beriklim tropis dan hangat seperti Eurasia, Australasia, Oseania, dan Indonesia. Melati terkenal akan aroma wangi yang khas.", "melati"},
            {"4", "BUNGA KEMBANG SEPATU", "Hibiscus rosa-sinensis alias kembang sepatu adalah bunga dengan kelopak cantik berwarna merah terang yang tergabung dalam suku Malvaceae. Kembang sepatu adalah tanaman semak yang berasal dari Asia Timur. Di daerah dengan iklim tropis seperti Indonesia, kembang sepatu lebih sering ditanam sebagai tanaman hias.", "sepatu"},
            {"5", "BUNGA KAMBOJA", "Ditemukan oleh seorang botanis berkebangsaan Perancis, Charles Plumier, menjadikan bunga kamboja menyandang nama latin Plumeria. Keberadaan bunga kamboja di Indonesia menjadikan tempat tumbuhnya mendapatkan anggapan sebagai tempat keramat, semisal di pemakaman atau tempat-tempat untuk sebagian orang yang masih menjalankan ritual-ritual tertentu.","kamboja"},
            {"6", "BUNGA KEMUNING", "Kemuning (Murraya paniculata) adalah tumbuhan tropis yang bisa berbunga sepanjang tahun dengan ketinggian pohon mencapai 7 meter. Kemuning kerap ditanam sebagai tanaman hias atau tanaman pagar. Bentuk daunnya yang kecil dengan bunga terminal yang wangi menjadikan kemuning makin digandrungi banyak pecinta tanaman.", "kemuning"},
            {"7", "BUNGA ALAMANDA", "Allamanda cathartica yang umum disebut sebagai bunga alamanda atau bunga terompet emas, bunga lonceng kuning, atau bunga buttercup adalah tanaman hias yang berasal dari Amerika Tengah dan Amerika Selatan. Selain dua tempat tersebut, bunga alamanda juga banyak ditemukan tumbuh di Brazil yang umum digunakan oleh masyarakatnya sebagai hiasan karena mempunyai bentuk yang indah.", "alamanda"}
    };

    public static ArrayList<TanamanModel> getListData() {
        TanamanModel tanaman = null;
        Log.d("DEBUG", "getListData: ");
        ArrayList<TanamanModel> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            tanaman = new TanamanModel();
            tanaman.setId(data[i][0]);
            tanaman.setNama(data[i][1]);
            tanaman.setDeskripsi(data[i][2]);
            tanaman.setGambar(data[i][3]);
            System.out.println(Arrays.asList(data[i]));
            System.out.println(data[i].length);
            list.add(tanaman);
        }
//        Log.d("DEBUG", "getListData: " + String.valueOf(data));
//        System.out.println(Arrays.asList(data));
        Log.d("DEBUG", "getListData: ");

        return list;
    }
}
