package id.unud.ac.tubesObat.data;

import java.util.ArrayList;

import id.unud.ac.tubesObat.Obat;
import id.unud.ac.tubesObat.R;

public class FluData {
    private static String[] obatName = {
            "Panadol Cold & Flu",
            "Bodrex Flu & PE",
            "OBH Combi Anak Batuk Plus Flu",
            "Tuzalos",
            "Procold Flu",
            "Hufagrip BP Sirup",
            "KomixOBH",
            "Anakonidin OBH Batuk & Pilek Anak"
    };

    private static String[] obatDesc = {
            "PANADOL COLD & FLU merupakan obat batuk dan pereda flu dengan kandungan Paracetamol, Pseudoephedrine HCl, dan Dextromethorphan HBr. Paracetamol digunakan sebagai pereda demam dan sakit kepala. Dextromethorphan HBr sebagai antitusif yang bisa menekan refleks batuk. Pseudoephedrine HCl bekerja membantu meredakan pembengkakan pembuluh darah di dalam hidung, sehingga obat ini dapat digunakan untuk meredakan gejala hidung tersumbat, batuk tidak berdahak, dan demam yang menyertai flu.",
            "BODREX FLU & BATUK TIDAK BERDAHAK PE mengandung Paracetamol, Dextromethorphan dan Phenylephrine, digunakan untuk mengatasi gejala flu seperti demam, bersin-bersin dan hidung tersumbat, disertai batuk tidak berdahak.",
            "OBH COMBI ANAK BATUK PLUS FLU mengandung zat aktif Extract Succus liquiritae, Paracetamol, Ammonium Chlorida, Pseudoephedrine HCl dan Chlorpheniramine Maleat. Obat ini digunakan untuk mengatasi gejala flu seperti demam, sakit kepala, bersin-bersin dan hidung tersumbat yang disertai batuk pada anak. Obat ini menyebabkan kantuk.",
            "TUZALOS merupakan obat batuk dan pereda flu dengan kandungan Paracetamol, Phenylpropanolamine, Dextromethorphan HBr, dan Chlorpheniramine maleat. Dextromethorphan HBr sebagai antitusif yang bisa menekan refleks batuk. Paracetamol digunakan sebagai pereda demam dan sakit kepala, Phenylpropanolamine digunakan untuk mengobati gejala hidung tersumbat. Chlorpheniramine maleate bekerja sebagai antihistamin atau anti alergi sehingga obat ini digunakan untuk mengatasi gejala flu seperti demam, sakit kepala, hidung tersumbat, dan bersin-bersin yang disertai batuk.",
            "PROCOLD FLU 6 KAPLET mengandung Paracetamol, Pseudoephedrin HCl, dan Chlorpeniramin Maleat, digunakan untuk mengatasi gejala flu seperti demam, hidung tersumbat dan bersin-bersin.",
            "HUFAGRIP BP SIRUP mengandung Chlorpeniramin Maleat, Pseudoefedrin dan Dextromethorphan HBr, digunakan untuk mengatasi gejala pilek seperti hidung tersumbat, bersin-bersin dan batuk kering/tidak berdahak.",
            "KOMIX mengandung Dextromethorphan HBr, Guaifenesin dan Chlorpheniramin Maleat, digunakan untuk meredakan gejala pilek dan batuk serta mengencerkan dahak.",
            "ANAKONIDIN SIRUP mengandung zat aktif Dextromethorphan HBr, Guaifenesin, Pseudoephedrine HCl, dan Chlorpheniramine Maleat. Obat ini digunakan untuk mengatasi gejala pilek seperti bersin-bersin dan hidung tersumbat yang disertai batuk pada anak. Obat ini menyebabkan kantuk."
    };

    private static int[] obatImage = {
            R.drawable.panadol_flu,
            R.drawable.bodrex_pe,
            R.drawable.combi,
            R.drawable.tuzalos,
            R.drawable.procold,
            R.drawable.hufagrip,
            R.drawable.komix,
            R.drawable.anakonidin
    };

    private static String[] obatIndikasi = {
            "Obat ini digunakan untuk meredakan gejala hidung tersumbat, batuk kering dan demam yang menyertai flu.",
            "Meredakan gejala-gejala flu seperti demam, sakit kepala, hidung tersumbat, dan bersin-bersin yang disertai batuk kering.",
            "Meredakan batuk yang disertai gejala-gejala flu pada anak seperti demam, sakit kepala, hidung tersumbat dan bersin-bersin.",
            "Obat ini digunakan untuk mengatasi gejala-gejala flu seperti: demam, pusing, bersin-bersin, hidung tersumbat, yang disertai batuk tidak berdahak.",
            "Meringankan gejala-gejala flu seperti demam, sakit kepala, dan hidung tersumbat.",
            "Meringankan pilek dan batuk tidak berdahak",
            "Untuk meredakan batuk",
            "Untuk meredakan batuk & gejala flu seperti demam, sakit kepala, hidung tersumbat, serta bersin-bersin."
    };

    private static String[] obatKategori = {
            "Obat Batuk & Flu",
            "Obat Batuk & Flu",
            "Obat Batuk & Flu",
            "Obat Batuk & Flu",
            "Obat Flu",
            "Obat Batuk & Flu",
            "Obat Batuk & Flu",
            "Obat Batuk & Flu"
    };

    private static String[] obatKomposisi = {
            "Paracetamol 500 mg, Pseudoephedrine HCl 30 mg, Dextromethorphan HBr 15 mg",
            "Paracetamol 500 mg, Phenylephrine HCl 10 mg, Dextromethorphan HBr 12 mg.",
            "Succus Liquiritiae 100 mg, Paracetamol 120 mg, Ammonium Chloride 50 mg, Pseudoephedrine HCL 7.5 mg, Chlorpheniramine Maleate 1.0 mg.",
            "Paracetamol 500 mg, dextromethorphan HBr 10 mg, phenylpropanolamine HCl 15 mg, chlorpheniramine maleate 1 mg.",
            "Paracetamol 500 mg, Phenylephrine HCl 10 mg, Chlorpeniramine maleate 2 mg.",
            "Dextromethorphan HBr 7.5 mg, Pseudoephedrine HCl 15 mg, Chlorpheniramine Maleate 0.5 mg.",
            "Guaifenesin 100 mg, dextromethorphan HBr 15 mg, chlorpheniramine maleate 2 mg",
            "Prekusor, tiap 5 ml: Paracetamol 120 mg, Succus Liquiritae 100 mg, Pseudoephedrine HCl 7.5 mg,Chlorpheniramine Maleate 1 mg. Tanpa alkohol."
    };

    private static String[] obatDosis = {
            "Dewasa: 1 kaplet tiap 4 - 6 jam, maximum: 8 kaplet/hari.",
            "Dewasa: 3 kali sehari 1 kaplet.\n " +
                    "Anak: 3 kali sehari 1/2 kaplet.",
            "Umur 2 - 5 tahun: 3 x sehari 1 sendok takar (@ 5 ml). \n" +
                    "Umur 6 - 12 tahun: 3 x sehari 2 sendok takar (@10 ml).\n",
            "Dewasa: 3 kali per hari 1 kaplet. \n" +
                    "Anak berusia (6 - 12 tahun): 0.5 kaplet, 3 kali per hari\n",
            "Dewasa dan anak > 12 tahun : 1 kaplet, diminum 3 kali per hari. \n" +
                    "Anak 6-12 tahun : 1/2 kaplet, diminum 3 kali per hari.\n",
            "Dewasa dan anak > 12 tahun: 3 x per hari, 2 sendok takar (@ 10 ml). \n" +
                    "Anak (6-12 tahun): 3 x per hari, 1 sendok takar (@ 5 ml). \n" +
                    "Anak (2-6 tahun): 3 x per hari, 0.5 sendok takar (@ 2.5 ml).\n",
            "Dewasa: 3 x sehari 1-2 sachet; anak 6-12 thn: 3 x sehari 1 sachet",
            "Anak 2-6 tahun: 3 kali sehari 1 sendok takar (5 mL) \n" +
                    "Anak 6-12 tahun : 3 kali sehari 2 sendok takar (10 mL).\n"
    };

    private static String[] obatAturan = {
            "Dikonsumsi sesudah makan.",
            "Dikonsumsi sesudah makan",
            "Dikonsumsi sesudah makan",
            "Dapat diberikan bersama atau tanpa makanan",
            "Dikonsumsi sebelum atau sesudah makan.",
            "Dikonsumsi sesudah makan.",
            "Dikonsumsi sesudah makan",
            "Dikonsumsi sesudah makan"
    };

    private static String[] obatKemasan = {
            "Dus, 10 blister @ 10 kaplet",
            "Dus, 25 Sachet @ 1 Blister @ 4 Kaplet Lapis Dua",
            "Dus, Botol @ 60 mL",
            "Catch Cover @ 1 strip @ 4 kaplet",
            "Dus, 24 Blister @ 6 Kaplet",
            "Dus, Botol @ 60 ml",
            "Dos, 5 Sachet @ 10 ML",
            "Dus, 24 Blister @ 30mL, dan 60mL"
    };

    private static String[] obatPerhatian = {
            "Awas, Obat Keras Bacalah Aturan Pakainya. Penderita dengan gangguan fungsi hati dan ginjal, glaukoma, hipertrofi prostat, hipertiroid, DM, penyakit jantung, hipertensi, kelebihan berat badan. Dapat mengganggu kemampuan mengemudi atau menjalankan mesin. Penggunaan bersama dengan obat lain yang menekan SSP. Kategori kehamilan: Kategori C: Mungkin berisiko. Obat digunakan dengan hati-hati apabila besarnya manfaat yang diperoleh melebihi besarnya risiko terhadap janin. Penelitian pada hewan uji menunjukkan risiko terhadap janin dan belum terdapat penelitian langsung terhadap wanita hamil.",
            "Hati-hati penggunaan pada penderita tekanan darah tinggi. Penderita yang sedang mengkonsumsi obat anti depresan. Meningkatkan risiko gangguan fungsi hati pada pasien yang mengkonsumsi alkohol.",
            "Hati-hati pada penderita dengan gangguan fungsi hati dan ginjal. Tidak dianjuran pada anak- anak usia dibawah 2 tahun, wanita hamil dan menyusui kecuali atas petunjuk dokter. Selama minum obat tidak boleh mengendarai kendaraan atau menjalankan mesin.",
            "Awas, Obat Keras Bacalah Aturan Pakainya. Tidak boleh diberikan pada penderita yang sensitif atau alergi terhadap obat simpatomimetik lain (seperti: efedrin, pseudoefedrin, fenilefrin), penderita tekanan darah tinggi, dan individu yang sedang mengkonsumsi anti depresan tipe penghambat monoamin oksidase (MAOI). Hati-hati penggunaan obat ini pada individu yang berpotensi mengalami tekanan darah tinggi atau stroke, atau individu usia lanjut. Hentikan penggunaan obat ini jika terjadi susah tidur, jantung berdebar, dan pusing. Kategori kehamilan : Kategori C: Mungkin berisiko. Obat digunakan dengan hati-hati apabila besarnya manfaat yang diperoleh melebihi besarnya risiko terhadap janin. Penelitian pada hewan uji menunjukkan risiko terhadap janin dan belum terdapat penelitian langsung terhadap wanita hamil.",
            "Hati- hati penggunaan pada penderita dengan gangguan fungsi hati dan ginjal. Tidak dianjurkan penggunaan pada anak usia di bawah 6 tahun, wanita hamil dan menyusui kecuali atas petunjuk dokter. Penggunaan pada penderita yang mengkonsumsi alkohol dapat meningkatkan resiko kerusakan hati.",
            "Hati-hati penggunaan pada penderita tekanan darah tinggi, atau stroke, seperti penderita dengan berat badan berlebih atau usia lanjut. Bila dalam 3 hari gejala flu tidak berkurang segera hubungi dokter. Hentikan penggunaan obat ini jika terjadi susah tidur, jantung berdebar dan pusing.",
            "Hati-hati penggunaan pada penderita dengan gangguan gungsi hati dan ginjal, glaukoma, hipertrofi prostat, hipertiroid, dan retensi urin. Tidak dianjurkan untuk anak < 6 tahun. Hati-hati penggunaan bersamaan dengan obat-obatan lain yang menekan susunan saraf pusat. Selama mengkonsumsi obat ini dilarang mengendarai motor dan menyalakan mesin",
            "Dilarang mengomsusmsi bagi Wanita hamil dan ibu menyusui.serta orang dewasa. Simpan pada tempat yang sejuk"
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
