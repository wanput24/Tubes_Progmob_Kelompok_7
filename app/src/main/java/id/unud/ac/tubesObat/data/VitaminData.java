package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class VitaminData {
    private static String[] obatName = {
            "Now FODS Vitamin A",
            "Imugard",
            "BlackMores D3",
            "CDR",
            "NouriSkin ULTIMATE"
    };

    private static String[] obatDesc = {
            "NOW Foods Vitamin A merupakan salah satu suplemen vitamin A yang memiliki dosis hingga 10.000 IU. Artinya, konsumsi vitamin A dari NOW Foods dengan takaran tertinggi hanya dianjurkan sebanyak satu butir per harinya.",
            "Imugard merupakan suplemen vitamin A yang terbuat dari bahan herbal dengan dungsi sebagai peningkat daya tahan tubuh. Suplemen vitamin A ini memiliki formula Triple Action Herbal yang terdiri dari meniran, daun kelor, dan kunyit yang efektif untuk memelihara daya tahan tubuh. Kandungan vitamin A yang terdapat dalam suplemen ini dapat ditemukan dari daun kelor yang digunakannya. Selain vitamin A, daun kelor juga kaya akan nutrisi lainnya, seperti kalsium, zat besi, fosfor, kalium, zinc, protein, vitamin B, vitamin C, vitamin D, vitamin E, vitamin K, asam folat, dan biotin.",
            "Vitamin D3 dosis tinggi 1000IU, untuk bantu penuhi kebutuhan Vitamin D harian, terutama pada kondisi tertentu seperti: lanjut usia, ibu hamil dan menyusui, risiko tinggi/penderita penyakit infeksi atau penderita autoimun. Tersedia dalam kemasan botol berisi 60 kapsul lunak.",
            "Tulang kuat diperlukan untuk menunjang aktifitas anda sehari-hari. Kekuatan tulang dapat dipersiapkan sejak dini, yakni dengan memenuhi kebutuhan kalsium anda setiap hari. Jika kekurangan kalsium, tulang bisa tipis dan rapuh di kemudian hari. CDR mengandung kalsium serta vitamin penting lainnya yang berperan dalam proses pembentukan tulang kuat dan sehat. CDR, dengan rasa jeruk segar membantu memenuhi kebutuhan kalsium anda setiap hari bila perlu agar tulang tetap kuat kini dan nanti.",
            "Nourish Skin Ultimate adalah suplemen kulit untuk mengatasi problem pada jenis kulit kering dan normal seperti timbulnya flek hitam membandel, keriput, kusam, kering dan kasar. kulit menjadi lebih tebal, kenyal dan kencang , bebas kerut dan keriput, menjaga kulit dari efek radikal bebas, Hasilnya flek-flek hitam memudar , kulit menjadi lebIh putih , segar, berseri, serta meningkatkan efektifitas kerja NourishSkin Ultimate dalam menjaga keindahan dan kesehatan kulit."

    };

    private static int[] obatImage = {
            R.drawable.now,
            R.drawable.imugard,
            R.drawable.blackmores,
            R.drawable.cdr,
            R.drawable.nurish
    };

    private static String[] obatIndikasi = {
            "Merupakan  suplemen vitamin A.",
            "Imugard merupakan suplemen vitamin A.",
            "Blackmores Vitamin D3 1000 IU mengandung Vitamin D3 dosis tinggi 1000IU",
            "Suplementasi Kalsium, Vitamin C, D, B6 agar tulang sehat pada orang dewasa serta membantu memenuhi kebutuhan kalsium ",
            "Nourish Skin Ultimate adalah suplemen kulit untuk mengatasi problem pada jenis kulit "
    };

    private static String[] obatKategori = {
            "Vitamin A",
            "Vitamin A (Multi Vitamin)",
            "Vitamin D3",
            "Vitamin C (Multi Vitamin)",
            "Vitamin K (Multi Vitamin)"
    };

    private static String[] obatKomposisi = {
            "Softgel capsule (bovine gelatin, glycerin, water) and organic extra virgin olive oil. Contains fish (cod, saithe, haddock, pollock).",
            "Meniran, Daun Kelor dan Kunyit",
            "Vitamin D3 1000IU (Cholecalciferol 25 mcg)",
            "Kalsium 250mg (dalam bentuk kalsium karbonat 625mg), Vitamin C 1000mg, Vitamin D 300 IU, Vitamin B6 15mg",
            "Amino Acid, Antioxidant (Vit. E, Vit. C Beta Carotene), Minerals"
    };

    private static String[] obatDosis = {
            "Satu butir per harinya (1x1)",
            "Satu butir per harinya (1x1 atau 2x1 tergantung kondisi tubuh)",
            "Dewasa – 1 kali sehari, 1 kapsul lunak setelah makan.",
            "1 tablet Effervescent per hari atau menurut petunjuk dokter",
            "Untuk 2 bulan pertama 1 tablet sesudah makan pagi dan 1 tablet sesudah makan malam\n" +
                    "Untuk perawatan, di bulan ke-3 dan seterusnya cukup 1 tablet sesudah makan malam\n"
    };

    private static String[] obatAturan = {
            " 1 Softgel per hari sesudah makan",
            "Dikonsumsi sesudah makan",
            "Dikonsumsi sesudah makan",
            "Larutkan tablet effervescent ke dalam segelas air untuk memperoleh minuman effervescent dengan rasa jeruk segar. Sebaiknya diminum segera setelah dilarutkan.",
            "Minum setelah makan malam."
    };

    private static String[] obatKemasan = {
            "Botol, 60 Kapsul",
            "Tablet, 12 Kapsul",
            "Botol, 60 Kapsul",
            "Botol, 30 Kapsul",
            "Dus, 60 Kapsul"
    };

    private static String[] obatPerhatian = {
            "Simpan NOW Vitamin A pada tempat yang sejuk, dan kering ketika sudah membuka segel, dan konsumsi satu buah setiap hari dengan makanan untuk hasil yang optimal. Hanya untuk orang dewasa, jangan dikonsumsi oleh anak-anak dan ibu hamil.",
            "Untuk menjaga daya tahan tubuh dan memberikan asupan nutrisi yang diperlukan, kamu bisa konsumsi suplemen vitamin A ini sebanyak 1 kali sehari atau 2 kali ketika merasa kurang sehat. Bisa juga dengan mengikuti anjuran yang telah diberikan dokter.",
            "1.\tSimpan di bawah 30° C, ditempat yang kering, dan jauhkan dari paparan sinar matahari langsung. \n" +
                    "2.\tJauhkan dari jangkauan anak-anak.\n" +
                    "3.\tPeriksa kadar Vitamin D darah sesudah penggunaan 6 bulan atau lebih.\n" +
                    "4.\tKonsultasikan dengan dokter untuk penggunaan pada ibu hamil dan menyusui.\n" +
                    "5.\tHentikan penggunaan bila terjadi gejala alergi.\n" +
                    "6.\tKonsumsi kalsium sesuai angka kecukupan gizi atau AKG untuk menghindari hiperkalsemia. \n",
            "Simpan di bawah 30° C, ditempat yang kering, dan jauhkan dari paparan sinar matahari langsung. Jauhkan dari jangkauan anak-anak.",
            "Simpan di bawah 30° C, ditempat yang kering, dan jauhkan dari paparan sinar matahari langsung. Jauhkan dari jangkauan anak-anak."
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
