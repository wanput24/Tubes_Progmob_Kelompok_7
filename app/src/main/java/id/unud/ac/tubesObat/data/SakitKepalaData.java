package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class SakitKepalaData {
    private static String[] obatName = {
            "Panadol Extra",
            "Paramex",
            "Bodrex Migra",
            "Biogesic Paracetamol",
            "Oskadon",
            "Paracetamol"
    };

    private static String[] obatDesc = {
            "Panadol Extra merupakan obat dengan kandungan Paracetamol dan Caffeine. Obat ini dapat digunakan untuk meringankan sakit kepala dan sakit gigi. Paracetamol sebagai analgetik, bekerja dengan meningkatkan ambang rasa sakit dan Caffeine bekerja dengan menghambat kerja reseptor adenosin sehingga mengurangi rasa nyeri.",
            "Paramex merupakan obat dengan kandungan Paracetamol, Propyphenazone, Caffeine, Dexchlorpheniramine maleate. Obat ini dapat digunakan untuk meringankan sakit kepala dan sakit gigi.",
            "Bodrex Migra merupakan obat dengan kandungan Paracetamol, propyphenazone, caffeine. Obat ini dapat digunakan untuk meredakan sakit kepala pada migraine. Migraine ditandai dengan rasa sakit yang berdenyut di salah satu sisi kepala.",
            "Biogesic merupakan obat dengan kandungan Paracetamol 500 mg. Obat ini dapat digunakan untuk meredakan demam, dismenorea, gangguan muskuloskeletal, sakit kepala, sakit gigi, dan arthritis.",
            "Oskadon adalah obat yang di gunakan sebagai penurun demam dan pereda nyeri seperti sakit gigi, sakit kepala dan nyeri ringan lainnya. Oskadon mengandung paracetamol obat yang memiliki efek sebagai antipiretik sekaligus analgesik, selain paracetamol kandungan oskadon terdiri dari caffeine yaitu obat stimulan sistem saraf pusat berguna mencegah kantuk.",
            "Paracetamol Tablet merupakan obat yang dapat digunakan untuk meringankan rasa sakit pada sakit kepala, sakit gigi, dan menurunkan demam. Paracetamol bekerja pada pusat pengatur suhu di hipotalamus untuk menurunkan suhu tubuh (antipiretik) serta menghambat sintesis prostaglandin sehingga dapat mengurangi nyeri ringan sampai sedang (analgesik)."

    };

    private static int[] obatImage = {
            R.drawable.panadol,
            R.drawable.paramex,
            R.drawable.bodrex_migra,
            R.drawable.biogesic,
            R.drawable.oskadon,
            R.drawable.paracetamol
    };

    private static String[] obatIndikasi = {
            "Obat ini digunakan untuk meringankan sakit kepala dan sakit gigi.",
            "Meringankan sakit kepala dan sakit gigi",
            "Meredakan sakit kepala sebelah (migraine)",
            "Meredakan sakit kepala, sakit gigi, nyeri otot, menurunkan demam yang menyertai flu & paska vaksinasi",
            "Mengurangi sakit kepala, pusing, menghilangkan segala macam rasa nyeri, dan menghilangkan demam.",
            "Obat ini digunakan untuk meredakan nyeri ringan hingga sedang seperti sakit kepala, sakit gigi, nyeri otot, serta menurunkan demam."
    };

    private static String[] obatKategori = {
            "Obat Sakit Kepala",
            "Obat Sakit Kepala",
            "Obat Sakit Kepala",
            "Obat Sakit Kepala & Panas",
            "Obat Sakit Kepala",
            "Obat Sakit Kepala, sakit gigi, nyeri otot, serta menurunkan demam"
    };

    private static String[] obatKomposisi = {
            "Tiap kaplet mengandung Paracetamol 500 mg dan Caffeine 65 mg.",
            "Paracetamol 250 mg, Propyphenazone 150 mg, Caffeine 50 mg, Dexchlorpheniramine maleate 1 mg",
            "Paracetamol 350 mg, Propyphenazone 150 mg, Caffeine 50 mg",
            "Paracetamol 500 mg",
            "Mengandung 350 mg paracetamol, 200 mg ibuprofen, dan 50 mg caffeine.",
            "Setiap tablet mengandung Paracetamol 500 mg."
    };

    private static String[] obatDosis = {
            "Dewasa dan anak-anak lebih dari 12 tahun: 3-4 kali sehari 1 kaplet, dikonsumsi dengan air minum. Jangan lebih dari 8 kaplet dalam 24 jam serta minimum interval penggunaan dosis adalah 4 jam.",
            "Dewasa dan anak-anak diatas 12 tahun : 2-3 kali sehari 1 tablet.",
            "Dewasa : 3 kali sehari 1 kaplet atau menurut petunjuk dokter.",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 0.5 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n",
            "Dewasa: 3 kali sehari 1 tablet.",
            "Dewasa: 1-2 kaplet, 3-4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak 7-12 tahun: 0.5 - 1 kaplet, 3-4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n",
            "Dewasa: 1 - 2 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 8 kaplet per hari. \n" +
                    "Anak (7 - 12 tahun): 0.5 - 1 kaplet, 3 sampai 4 kali per hari. Penggunaan maximum 4 kaplet per hari.\n"
    };

    private static String[] obatAturan = {
            "Sebelum atau sesudah makan.",
            "Dikonsumsi sesudah makan",
            "Dikonsumsi sesudah makan",
            "Obat dapat diminum sebelum atau sesudah makan.",
            "Dikonsumsi sesudah makan",
            "Obat dapat diminum sebelum atau sesudah makan.",
            "Obat dapat diminum sebelum atau sesudah makan."
    };

    private static String[] obatKemasan = {
            "Dus, 10 Amplop @ 1 Blister @ 10 Kaplet",
            "Dus, 50 Catch Cover @ 1 Strip @ 4 Tablet.",
            "Dus, 25 Blister @ 4 kaplet.",
            "Dus, 25 Blister @ 4 Tablet",
            "Dus, 50 Strip @ 4 Tablet",
            "Dus, 10 Strip @ 10 Tablet",
            "Dus, 25 Blister @ 4 Tablet"
    };

    private static String[] obatPerhatian = {
            "Hati-hati penggunaan obat ini pada kondisi : \n" +
                    "- Penggunaan pada wanita hamil dan menyusui menurut nasehat dokter. \n" +
                    "- Hentikan penggunaan obat ini bila rasa sakit menetap lebih dari 5 hari, harap konsultasi ke dokter. \n" +
                    "- Selama minum obat ini, minumlah sedikit mungkin cola yang mengandung caffeine (misalnya : kopi, teh, cola), sebab caffeine yang terlalu banyak mungkin menyebabkan gelisah, iritabilotas, sukar tidur, dan jantung berdebar. \n" +
                    "- Tidak dianjurkan penggunaan secara bersamaan dengan obat lain yang mengandung Paracetamol. \n" +
                    "- Penggunaan dosis tinggi dapaet menyebabkan kerusakan hati. \n" +
                    "- Hati-hati penggunaan obat ini pada penderita penyakit ginjal.\n",
            "- Hati-hati penggunaan pada penderita porphyria akut karena dapat menimbulkan porphyrinogenic \n" +
                    "- Bila setelah 5 hari nyeri tidak hilang, segera hubungi dokter \n" +
                    "- Obat ini dapat menyebabkan kantuk \n" +
                    "- Penggunaan pada penderita yang mengkonsumsi alkohol dapat merningkatkan resiko kerusakan hati\n",
            "Hati-hati penggunaan pada penderita porfiria. Bila setelah 5 hari rasa nyeri tidak berkurang, segera hubungi dokter. Penggunaan obat ini pada penderita yang mengkonsumsi alkohol, dapat meningkatkan resiko kerusakan fungsi hati. Hati-hati penggunaan obat ini pada penderita penyakit ginjal.",
            "Pasien dengan gagal ginjal, gangguan fungsi hati",
            "-Jangan menggunakan Oskadon jika Anda memiliki riwayat alergi terhadap bahan yang terkandung dalam Oskadon.\n" +
                    "-Jangan mengonsumsi alkohol bersama Oskadon, karena dapat meningkatkan risiko kerusakan hati.\n" +
                    "-Jangan memberikan Oskadon kepada anak usia di bawah 2 tahun, tanpa anjuran dokter.\n" +
                    "-Harap berhati-hati menggunakan Oskadon jika Anda menderita gangguan ginjal atau penyakit hati.\n" +
                    "-Beri tahu dokter jika Anda sedang menggunakan obat-obatan lain, termasuk suplemen dan produk herbal.\n" +
                    "-Beri tahu dokter jika Anda sedang hamil, menyusui, atau merencanakan kehamilan sebelum mengonsumsi Oskadon.\n" +
                    "-tSegera lakukan pemeriksaan ke dokter jika Anda mengalami overdosis atau reaksi alergi obat setelah mengonsumsi Oskadon.\n",
            "Hati-hati penggunaan pada pasien dengan gagal ginjal, gangguan fungsi hati, dan alergi atau mengalami hipersensitivitas terhadap paracetamol. Kategori kehamilan: Kategori B: Mungkin dapat digunakan oleh wanita hamil. Penelitian pada hewan uji tidak memperlihatkan ada nya risiko terhadap janin, namun belum ada bukti penelitian langsung terhadap wanita hamil.",
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
