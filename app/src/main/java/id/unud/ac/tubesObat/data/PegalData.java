package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class PegalData {
    private static String[] obatName = {
            "Counterpain",
            "HotINCream",
            "Sanmol Paracetamol",
            "Dumin Paracetamol",
            "Paracetamol"
    };

    private static String[] obatDesc = {
            "COUNTERPAIN CREAM merupakan krim pereda nyeri dengan sensasi hangat untuk mengurangi rasa sakit pada otot, sendi, keseleo, dan encok.",
            "HOT IN CREAM TUBE 120 GR berguna untuk mengatasi capek, pegal-pegal dan nyeri otot yang mengganggu aktivitas harian.",
            "Meredakan nyeri termasuk sakit kepala dan sakit gigi. Meredakan demam akibat flu & setelah imunisasi.",
            "Dumin 500mg Obat Turun Panas Demam. Pereda Sakit Kepala isi 10 Tablet. DUMIN merupakan obat dengan kandungan Paracetamol 500 mg. Obat ini dapat digunakan untuk meredakan nyeri seperti sakit kepala, sakit gigi, nyeri otot dan demam.",
            "Paracetamol Tablet merupakan obat yang dapat digunakan untuk meringankan rasa sakit pada sakit kepala, sakit gigi, dan menurunkan demam. Paracetamol bekerja pada pusat pengatur suhu di hipotalamus untuk menurunkan suhu tubuh (antipiretik) serta menghambat sintesis prostaglandin sehingga dapat mengurangi nyeri ringan sampai sedang (analgesik)."
    };

    private static int[] obatImage = {
            R.drawable.counterpain,
            R.drawable.hotin,
            R.drawable.sanmol,
            R.drawable.dumin,
            R.drawable.paracetamol
    };

    private static String[] obatIndikasi = {
            "Nyeri Otot, nyeri Sendi yang berhubungan dengan tertarik atau robeknya ligamen otot sendi, memar, sakit pada punggung bawah dan cedera olahraga.",
            "Mengatasi capek, pegal-pegal dan nyeri otot",
            "SANMOL PARACETAMOL SYRUP ~ sirup penurun panas, pereda nyeri anak",
            "Dumin Paracetamol- Pereda atau penurun panas",
            "Obat ini digunakan untuk meredakan nyeri ringan hingga sedang seperti sakit kepala, sakit gigi, nyeri otot, serta menurunkan demam."
    };

    private static String[] obatKategori = {
            "Obat Pegal, Otot, Tulang, dan Sendi",
            "Obat Pegal, Otot, Tulang, dan Sendi",
            "Obat Penurun Panas & Pereda Nyeri",
            "Obat Penurun Panas & Pereda Nyeri",
            "Obat Sakit Kepala, sakit gigi, nyeri otot, serta menurunkan demam"
    };

    private static String[] obatKomposisi = {
            "Methyl salicylate 102 mg, Menthol 54.4 mg, Eugenol 13.6 mg",
            "Tiap G Mengandung: Menthol 70 Mg, Metil Salisilat 25 Mg, Eucalyptus Oil 1 Mg, Sereh Oil 1 Mg, Pine Oil 2,5 Mg.",
            "Ibuprofen 200 mg tiap 5 ml. ",
            "Paracetamol 500 mg.",
            "Setiap tablet mengandung Paracetamol 500 mg."
    };

    private static String[] obatDosis = {
            "Gunakan sehari 1-3 kali",
            "Sesuai kebutuhan",
            "Anak berusia 6-12 tahun: 3-4 kali sehari 2-4 sendok teh.\n" +
                    "Anak berusia 2-5 tahun: 3-4 kali sehari 1-2 sendok teh. \n" +
                    "Bayi: 3-4 kali sehari 1/2 sendok teh.\n",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 1/2 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 0.5 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n"
    };

    private static String[] obatAturan = {
            "Oleskan pada bagian yang diinginkan",
            "Oleskan secukupnya ke bagian yang sakit/diinginkan",
            "Dikonsumsi sesudah makan",
            "Obat dapat diminum sebelum atau sesudah makan.",
            "Obat dapat diminum sebelum atau sesudah makan."
    };

    private static String[] obatKemasan = {
            "Dus, tube @ 30 g",
            "Tube 120 ml",
            "Dus, Papan 5 Tablet",
            "Dus, Papan 10 Tablet",
            "Dus, 25 Blister @ 4 Tablet"
    };

    private static String[] obatPerhatian = {
            "Jangan digunakan pada mata, mukosa, atau lesi kulit yg terbuka lainnya. Jangan ditutup dengan perban. Hentikan penggunaan jika terjadi iritasi.",
            "Tidak cocok untuk anak-anak usia di bawah 2 tahun. Jangan di oles dibawah hidung langsung.",
            "Simpan pada tempat sejuk dan digunakan sesuai resep dokter.",
            "Simpan pada tempat sejuk dan digunakan sesuai resep dokter.",
            "Pasien dengan gagal ginjal, gangguan fungsi hati"
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
