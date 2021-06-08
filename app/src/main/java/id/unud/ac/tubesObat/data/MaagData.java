package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class MaagData {
    private static String[] obatName = {
            "Colidan Kapsul",
            "Hufamag Plus",
            "Mylanta",
            "Promag",
            "Esamag"
    };

    private static String[] obatDesc = {
            "Gangguan lambung disebabkan oleh berbagai hal, antara lain, stress, kelelahan, kurang tidur, pola makan tidak teratur, mengonsumsi makanan pedas, bersantan, dan asam, serta akibat infeksi oleh bakteri Helicobacter Pylori. Hal-hal tersebut dapat meningkatkan produksi enzim dan asam lambung yang dapat mengiritasi lambung dan menyebabkan terjadinya luka, sehingga menimbulkan nyeri pada lambung. Colidan merupakan suplemen yang dapat memelihara kesehatan lambung, yang terbuat dari bahan natural, yaitu sari ganggang laut yang berasal dari perairan laut lepas Okinawa, Jepang, yaitu Mozuku atau Cladosiphon Okamuranus Tokida yang umumnya disebut Fucoidan. Colidan bekerja dengan cara membentuk selaput yang melindungi dinding lambung sehingga terhindar dari iritasi akibat enzyme dan asam lambung, serta infeksi bakteri.",
            "Hufamag kombinasi Aluminium Hydroxide dan Magnesium Hydroxide merupakan antasida yang bekerja menetralkan asam lambung dan menginaktifkan pepsin, sehingga rasa nyeri ulu hati akibat iritasi oleh asam lambung dan pepsin berkurang. Di samping itu, efek laksatif dari Magnesium Hydroxide akan mengurangi efek konstipasi dari Aluminium Hydroxide. Simethicone mengurangi gelembung-gelembung gas dalam saluran cerna yang menyebabkan rasa kembung berkurang.",
            "Mylanta Cair merupakan obat syrup yang lebih cepat diserap oleh lambung dapat membantu meredakan nyeri lambung dan mual yang disebabkan oleh kelebihan asam lambung, gastritis, tukak lambung, tukak usus dua belas jari dengan gejala-gejala seperti mual, nyeri lambung, dan nyeri ulu hati.\n" +
                    "-Membantu meredakan nyeri akibat kelebihan asam lambung\n" +
                    "- Membantu meringankan mual dan nyeri lambung serta nyeri ulu hati\n" +
                    "- Lebih cepat diserap oleh lambung\n" +
                    "- Sangat aman dikonsumsi oleh anak-anak maupun dewasa\n",
            "Promag bermanfaat untuk mengatasi sakit maag, penyakit asam lambung naik, dan perut kembung. Obat ini dijual secara bebas. Promag tersedia dalam bentuk tablet kunyah dan suspensi cair dengan kandungan bahan aktif yang bervariasi di tiap jenisnya.",
            "Esemag mengandung zat aktif Curcuminoid dari Kunyit, Licorice dan meniran yang baik untuk membantu meringankan gangguan lambung. Membantu meringankan gangguan lambung, seperti mual, muntah, rasa perih/tidak enak di ulu hati."

    };

    private static int[] obatImage = {
            R.drawable.colidan,
            R.drawable.hufamag,
            R.drawable.mylanta,
            R.drawable.promag,
            R.drawable.esamag
    };

    private static String[] obatIndikasi = {
            "Colidan merupakan suplemen yang dapat memelihara kesehatan lambung",
            "HUFAMAG PLUS tablet merupakan obat yang digunakan untuk mengatasi gangguan pada saluran pencernaan seperti gastritis, perut kembung, maag, dispepsia, hiatus hernia, tukak lambung dan tukak usus duabelas jari",
            "Untuk membantu meredakan gejala-gejala yang berhubungan dengan kelebihan asam lambung, gastritis (iritasi lapisan lambung), tukak lambung, tukak usus dua belas jari dengan gejala-gejala seperti mual, nyeri lambung, dan nyeri ulu hati.",
            "Promag bermanfaat untuk mengatasi sakit maag.",
            "Sakit perut lambung maag perih."
    };

    private static String[] obatKategori = {
            "Obat Lambung",
            "Obat Lambung",
            "Obat Lambung",
            "Obat Lambung",
            "Obat Lambung"
    };

    private static String[] obatKomposisi = {
            "Mengandung Fucoidan Ekstrak 100 mg.",
            "Dried Aluminium Hydroxide Gel 250 mg (setara Aluminium Hydroxide 200 mg), Magnesium Hydroxide 200 mg, Simethicon 50 mg",
            "Mg (OH)2 200 mg, Al (OH)3 200 mg, Simethicone 20 mg",
            "Hydrotalcite 200 mg, Magnesium Hidroksida 150 mg, Simethicone 50 mg.",
            "Curcuma Domestica Rhizoma Extract, Licorice Extract (Glycyrrhiza Glabra Radix), Phylanthus Niruri Herba Extract (Kunyit Licorice, Akar ManisMeniran danMadu)."
    };

    private static String[] obatDosis = {
            "1x1 (tergantung ketika penyakit lambung ada)",
            "Dewasa & Anak > 12 Tahun: 3 - 4 kali sehari, 1-2 tablet kunyah\n" +
                    "Anak-anak (6 - 12 tahun): 3 - 4 kali sehari, ½ - 1 tablet kunyah\n",
            "Dewasa: 1-2 sendok takar (5-10 ml) 3-4 kali sehari.\n" +
                    "Anak-anak: 6-12 tahun -1 sendok takar (2,5-5ml) 3-4 kali sehari.\n",
            "Dewasa & Anak diatas 12 th: 3-4 kali sehari, 1-2 tablet\n" +
                    "Anak-anak 6-12 th: 3-4 kali sehari, ½- 1 tablet atau ikuti petunjuk dokter.\n",
            "Dewasa & Anak diatas 12 th: 3-4 kali sehari, 1-2 tablet\n" +
                    "Anak-anak 6-12 tH: 3-4 kali sehari, ½- 1 tablet atau ikuti petunjuk dokter.\n"
    };

    private static String[] obatAturan = {
            "Minum setelah makan, tergantung ketika penyakit lambung ada.",
            "Diminum segera saat timbul gejala dan dianjurkan 1-2 jam sebelum atau setelah makan dan sebelum tidur.",
            "Diminum 1 jam sebelum makan atau 2 jam setelah makan dan menjelang tidur. ",
            "Dianjurkan untuk meminum obat ini segera pada saat timbul gejala dan dilanjutkan 1-2 jam, sebelum atau setelah makan dan sebelum tidur makam. Dapat diminum dengan air atau dikunyah langsung",
            "Dianjurkan untuk meminum obat ini segera pada saat timbul gejala dan dilanjutkan 1-2 jam dan setelah makan"
    };

    private static String[] obatKemasan = {
            "2 blister @ 10 kapsul.1 Box isi 2 Blister",
            "2 blister @ 10 kapsul.1 Box isi 2 Blister",
            "Botol 150ml",
            "Tablet, 12 kapsul",
            "Dus, 5 Sachet @ 10 ML"
    };

    private static String[] obatPerhatian = {
            "Simpan di tempat sejuk (15-25) C, kering dan terlindung dari cahaya.",
            "Simpan di tempat sejuk (15-25) C, kering dan terlindung dari cahaya.",
            "Simpan di tempat sejuk (15-25) C, kering dan terlindung dari cahaya. Tidak boleh diberikan kepada penderita gangguan fungsi ginjal yang berat.",
            "Pada penderita gangguan fungsi ginjal pemberian antasida mengandung Magnesium dapat menimbukan hipermagnesia. Tidak dianjurkan digunakan terus- menerus lebih dari 2 minggu, kecuali atas petunjuk dokter, karena dapat menimbulkan ketergantungan fungsi lambung. Pemberian Antasida dapat mengganggu absorsi Tetrasiklin, Simetidin, dll, sehingga bila diperlukan bersama harus diminum selang waktu 2 jam. Tidak dianjurkan untuk anak- anak dibawah 6 th, karena biasanya kurang jelas penyebabnya. Hati- hati pemberian pada penderita diet fosfor rendah dan pemakaian lama, karena dapat mengurangi fosfor dalam darah. Simpan di bawah suhu 30ºC dan hindarkan dari sinar matahari",
            "Simpan di tempat sejuk (15-25) C, kering dan terlindung dari cahaya matahari."
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
