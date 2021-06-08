package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class PanasData {
    private static String[] obatName = {
            "Bodrex",
            "Proris Forte",
            "Sanmol Paracetamol",
            "Dumin Paracetamol",
            "Biogesic Paracetamol",
            "Paracetamol"
    };

    private static String[] obatDesc = {
            "Bodrex mengandung paracetamol dan kafein, bekerja sinergis untuk mengobati rasa nyeri ringan hingga sedang.",
            "Proris Forte adalah obat yang digunakan sebagai pereda demam, nyeri ringan khususnya ketika pasien juga mengalami peradangan, dan mengurangi gangguan inflamasi (peradangan) secara umum.",
            "Meredakan nyeri termasuk sakit kepala dan sakit gigi. Meredakan demam akibat flu & setelah imunisasi.",
            "Dumin 500mg Obat Turun Panas Demam. Pereda Sakit Kepala isi 10 Tablet. DUMIN merupakan obat dengan kandungan Paracetamol 500 mg. Obat ini dapat digunakan untuk meredakan nyeri seperti sakit kepala, sakit gigi, nyeri otot dan demam.",
            "Biogesic merupakan obat dengan kandungan Paracetamol 500 mg. Obat ini dapat digunakan untuk meredakan demam, dismenorea, gangguan muskuloskeletal, sakit kepala, sakit gigi, dan arthritis.",
            "Paracetamol Tablet merupakan obat yang dapat digunakan untuk meringankan rasa sakit pada sakit kepala, sakit gigi, dan menurunkan demam. Paracetamol bekerja pada pusat pengatur suhu di hipotalamus untuk menurunkan suhu tubuh (antipiretik) serta menghambat sintesis prostaglandin sehingga dapat mengurangi nyeri ringan sampai sedang (analgesik).",
            "Obat ini digunakan untuk meredakan nyeri ringan hingga sedang seperti sakit kepala, sakit gigi, nyeri otot, serta menurunkan demam."
    };

    private static int[] obatImage = {
            R.drawable.bodrex,
            R.drawable.proris,
            R.drawable.sanmol,
            R.drawable.dumin,
            R.drawable.biogesic,
            R.drawable.paracetamol
    };

    private static String[] obatIndikasi = {
            "Meredakan sakit kepala, sakit gigi, nyeri otot, demam.",
            "Menurunkan demam pada anak-anak. Meringankan nyeri ringan sampai sedang, Antara lain : Nyeri pada dismenore primer (Nyeri Haid), Nyeri pada Penyakit gigi atau pencabutan gigi, Sakit Kepala.",
            "SANMOL PARACETAMOL SYRUP ~ sirup penurun panas, pereda nyeri anak",
            "Dumin Paracetamol- Pereda atau penurun panas",
            "Meredakan sakit kepala, sakit gigi, nyeri otot, menurunkan demam yang menyertai flu & paska vaksinasi",
            "Obat ini digunakan untuk meredakan nyeri ringan hingga sedang seperti sakit kepala, sakit gigi, nyeri otot, serta menurunkan demam."
    };

    private static String[] obatKategori = {
            "Obat Penurun Panas, Sakit Kepala & Sakit Gigi",
            "Obat Penurun Panas",
            "Obat Penurun Panas & Pereda Nyeri",
            "Obat Penurun Panas & Pereda Nyeri",
            "Obat Sakit Kepala & Panas",
            "Obat Sakit Kepala, sakit gigi, nyeri otot, serta menurunkan demam"
    };

    private static String[] obatKomposisi = {
            "Setiap tablet mengandung paracetamol 600 mg, caffeine 50 mg.",
            "Ibuprofen 200 mg tiap 5 mL. ",
            "Ibuprofen 200 mg tiap 5 ml. ",
            "Paracetamol 500 mg.",
            "Paracetamol 500 mg",
            "Setiap tablet mengandung Paracetamol 500 mg."
    };

    private static String[] obatDosis = {
            "Dewasa: 3-4 kali sehari, 1-2 tablet. \n" +
                    "Anak-anak 6-12 tahun: 3-4 kali sehari, 1/2-1 tablet.\n",
            "Dewasa: 3-4 kali /hari @5ml.\n" +
                    "Anak-anak 8-12 tahun : 3-4 kali/hari @ 5ml.\n" +
                    "Anak-anak 3-7 tahun : 3-4 kali /hari @2, 5ml \n",
            "Anak berusia 6-12 tahun: 3-4 kali sehari 2-4 sendok teh.\n" +
                    "Anak berusia 2-5 tahun: 3-4 kali sehari 1-2 sendok teh. \n" +
                    "Bayi: 3-4 kali sehari 1/2 sendok teh.\n",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 1/2 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 0.5 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n"
    };

    private static String[] obatAturan = {
            "Dikonsumsi sesudah makan.",
            "Dikonsumsi sesudah makan",
            "Dikonsumsi sesudah makan",
            "Obat dapat diminum sebelum atau sesudah makan.",
            "Obat dapat diminum sebelum atau sesudah makan."
    };

    private static String[] obatKemasan = {
            "Dus, 20 Tablet",
            "Botol, 50 mL",
            "Dus, Papan 5 Tablet",
            "Dus, Papan 10 Tablet",
            "Dus, 25 Blister @ 4 Tablet"
    };

    private static String[] obatPerhatian = {
            "Hati-hati pada penderita dengan gangguan fungsi hati dan ginjal. Tidak dianjuran pada anak- anak usia dibawah 2 tahun, wanita hamil dan menyusui kecuali atas petunjuk dokter. Selama minum obat tidak boleh mengendarai kendaraan atau menjalankan mesin.",
            "Hati-hati pada penderita dengan gangguan fungsi hati dan ginjal. Tidak dianjuran pada anak- anak usia dibawah 2 tahun, wanita hamil dan menyusui kecuali atas petunjuk dokter. Selama minum obat tidak boleh mengendarai kendaraan atau menjalankan mesin.",
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
