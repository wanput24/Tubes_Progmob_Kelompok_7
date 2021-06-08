package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class LukaData {
    private static String[] obatName = {
            "Betadine",
            "IODOSORB",
            "Bacitracin Polymyxin B Indofarma",
            "Bioplacenton",
            "Sofra-Tulle BP 1%"
    };

    private static String[] obatDesc = {
            "BETADINE SOLUTION merupakan antiseptik luka dengan kandungan Povidone Iodine 10% untuk membunuh kuman penyebab infeksi.",
            "Iodosorb adalah sediaan topikal yang mengandung cadexomer berisi iodine 0.9%. Iodosorb digunakan sebagai antiseptik dan tidak bersifat sitoksik yang dilepaskan perlahan (lepas lambat).",
            "Merupakan salah satu obat luka yang ampu mengeringkan atau menyembuhkan luka badan dengan ampu dengan cara hanya mengoleskan pada era luka pada tubuh dengan teratur.",
            "BIOPLACENTON merupakan obat yang mengandung Placenta Extract dan Neomycin Sulfate. Obat ini biasa digunakan untuk mengobati luka bakar, luka dengan infeksi, serta luka kronik dan jenis luka yang lain. Extrak plasenta bekerja dengan memicu pembentukan jaringan baru dan untuk wound healing, sedangkan neomycin bekerja dengan mencegah atau mengatasi infeksi bakteri Gram negative pad area luka. Dalam penggunaan obat ini harus dengan resep Dokter.",
            "SOFRA TULLE merupakan kas steril dengan kandungan antibiotik Framyctin Sulphate BP 1%. Kasa ini memiliki aktifitas antibakteri dan merupakan pembalut yang baik untuk digunakan dalam berbagai luka infeksi. Dalam penggunaan kas ini, sebaiknya luka dibersihkan terlebih dahulu. Jika lesi keluar deras, disarankan kas ini diganti sekali per hari. Dalam pengunaan obat ini harus sesuai dengna petunjuk dokter. "

    };

    private static int[] obatImage = {
            R.drawable.betadine,
            R.drawable.iodosorb,
            R.drawable.bacitracin,
            R.drawable.bioplaciton,
            R.drawable.sufra
    };

    private static String[] obatIndikasi = {
            "Antiseptik untuk Infeksi kulit dan luka pada tubuh.",
            "Antiseptik yang aktif terhadap bakteri, jamur dan virus, serta dapat menembus lapisan biofilm bakteri.",
            "Digunakan untuk orang-orang yang sedang mengalami infeksi kulit akibat bakteri, kolitis pseudomembran, infeksi superfisial, infeksi membran mukosa luar, dan lainnya.",
            "Informasi obat ini hanya untuk kalangan medis. Luka bakar, luka dengan infeksi, serta luka kronik dan jenis luka yang lain.",
            "Informasi obat ini hanya untuk kalangan medis. Merupakan obat/kasa steril untuk luka bakar ringan, dan luka lain."
    };

    private static String[] obatKategori = {
            "Obat Luka",
            "Obat Luka",
            "Obat Luka",
            "Obat Luka Kulit",
            "Obat Luka"
    };

    private static String[] obatKomposisi = {
            "Povidone iodine 10 %.",
            "Cadexomer iodine 0.9%.",
            "Tiap gram krim mengandung bacitracin zinc dan polymyxin B sulfate",
            "Placenta extract 10% dan Neomycin sulfate 0.5%",
            "Framycetin sulphate BP 1%"
    };

    private static String[] obatDosis = {
            "Dioleskan beberapa kali sehari pada daerah luka.",
            "-",
            "Dioleskan 1-3 kali dalam sehari.",
            "Dioleskan 4-6 x sehari atau sesuai kebutuhan pada area luka.",
            "1 sachet 1 x sehari"
    };

    private static String[] obatAturan = {
            "Dioleskan pada bagian tubuh yang luka.",
            "Taburkan Iodosorb pada permukaan luka sesuai dengan bentuk luka hingga membentuk lapisan setebal ±3 mm. Tutup luka secara keseluruhan dengan dressing sekunder. Iodosorb harus diganti jika telah jenuh oleh cairan luka dan semua iodine telah dilepaskan (dapat dilihat dari memudarnya warna Iodosorb), biasanya diganti 2-3 kali seminggu atau jika banyak cairan luka, perlu diganti setiap hari.",
            "Oleskan tipis-tipis pada area kulit yang terluka.",
            "Dioleskan pada kulit yang sakit/lepuh/terbakar setelah kulit dibersihkan dan dikeringkan",
            "Gunakan pada bagian yang dibutuhkan"
    };

    private static String[] obatKemasan = {
            "Dus, 6 Botol @ 5 ml",
            "Sachet 3 gram",
            "Tube, 5 Gram",
            "Dus, Tube @ 15 gram",
            "Dus, 10 Sachet @ 1 Plester"
    };

    private static String[] obatPerhatian = {
            "Perhantian terhadap Idiosinkrasi yodium",
            "Iodosorb digunakan untuk terapi topikal pa Hindari penggunaan Iodosorb jika pasien memiliki indikasi:\n" +
                    "Luka dengan jaringan nekrotik yang kering.\n" +
                    "Pasien dengan sensitivitas terhadap iodine atau komponen lain dalam produk ini.\n" +
                    "Anak-anak, ibu hamil, atau menyusui serta pada pasien dengan kelainan ginjal atau gangguan tiroid. dan luka kronik yang bereksudat pada ulkus vena, ulkus diabetik, ulkus dekubitus (kerusakan jaringan setempat yang disebabkan oleh iskemia pada kulit akibat tekanan dari luar yang berlebihan)\n",
            "•\tTidak bisa digunakan pada pasien yang memiliki hipersensitivitas terhadap kandungan Bacitracin atau antibakteri topikal yang satu golongan dengan Bacitracin.\n" +
                    "•\tReaksi alergi yang ditandai dengan gatal-gatal, ruam, munculnya bintik-bintik, kulit kemerahan, dan iritasi\n" +
                    "•\tBerhati-hatilah dalam menggunakan obat Bacitracin. Jangan sampai Bacitracin masuk ke dalam mulut karena bisa membahayakan fungsi ginjal anda.\n",
            "Harus dengan resep dokter. Hentikan penggunaan jika terjadi sensitisasi. Penggunaan neomycin sulfate untuk periode yang lama dapat menyebabkan infeksi sekunder (jamur). Jangan gunakan obat ini pada mata.",
            "HARUS DENGAN RESEP DOKTER. Alergi terhadap lanolin, framicetin, dan infeksi oleh organisme yang framisetin"
    };

    public static ArrayList<Obat> getListData(){
        ArrayList<Obat> list = new ArrayList<>();
        for (int position = 0; position<obatName.length; position++){
            Obat obat = new Obat();
            obat.setName(obatName[position]);
            obat.setDesc(obatDesc[position]);
            obat.setPhoto(obatImage[position]);
            obat.setIndikasi(obatIndikasi[position]);
            obat.setKategori(obatKategori[position]);
            obat.setKomposisi(obatKomposisi[position]);
            obat.setDosis(obatDosis[position]);
            obat.setAturan(obatAturan[position]);
            obat.setKemasan(obatKemasan[position]);
            obat.setPerhatian(obatPerhatian[position]);
            list.add(obat);
        }
        return list;
    }
}
