package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NovelList = listOf<NovelClass>(
            NovelClass(
                R.drawable.novel1,
                novelname = "I Wuf U - Ketika Terlalu Takut Mengatakan I Love U",
                noveldate = "Tanggal Terbit: \n April 2017\n",
                novelauthor = "Penulis: \nWulan Fadila Fatia",
                novelrate = "Rating: (5,0)",
                ratingbar = 5.0,
                noveldesc = "Deskripsi: \nIris, Ira, Ari dan Alden. Kalian akan berkenalan dengan Iris, perempuan yang hidup dengan menari, bernafas seraya menutup diri dari dunia dan " +
                        "tidak pernah mengerti arti kasih sayang yang sebenarnya. " +
                        "Kalian akan mengikuti Ira, perempuan yang paham akan artinya sesak, satu dari jutaan hati malang yang tersesat, dan iri yang memuncak. Kalian akan mengerti Ari, laki-laki yang berusaha berubah menjadi lebih baik, menahan candu dengan permen Yupi dan terjebak zona pertemanan. Kalian akan jatuh hati pada Alden, laki-laki yang berhadapan pada 0.1 persen, berjuang mengalahkan penyakitnya dan tahu sakitnya bertepuk sebelah tangan. Kalian akan mungkin atau mungkin tidak jatuh cinta pada cerita ini." +
                        "\n" +
                        "\n" +
                        "I Wuf U merupakan buku karya Wulanfadi yang memenangkan wattys tahun 2014.\n" +
                        "Judul: I Wuf U - Ketika Terlalu Takut Mengatakan I Love U\n" +
                        "Penulis: Wulan Fadila Fatia\n" +
                        "Penerbit: Coconut Books\n" +
                        "Dimensi: 14 cm x 2,5 cm\n" +
                        "Halaman: 440\n" +
                        "Format: Soft Cover\n" +
                        "ISBN: 9786026940667\n" +
                        "Tanggal Terbit April 2017"),
            NovelClass(
                R.drawable.novel2,
                novelname = "Story of Seth",
                noveldate = "Tanggal Terbit: \n11 Januari 2019\n",
                novelauthor = "Penulis: \nWulan Fadila Fatia",
                novelrate = "Rating: (5,0)",
                ratingbar = 5.0,
                noveldesc = "Deskripsi: Buku Story of Seth merupakan karya Wulan Fadila Fatia. Ia memiliki minat luar biasa dalam bidang penulisan dan film. Dalam menyalurkan hobi menulis, Wulan menerbitkan cerita buatannya melalui Wattpad. Karya-karya yang ia buat antara lain Matt & Mou, Brothermaker, R: Raja, Ratu, dan Rahasia, Sadena dan Sandra, dan masih banyak lagi.\n" +
                        "Format : Soft cover\n" +
                        "Jumlah halaman : 322 halaman\n" +
                        "Tanggal terbit : 11 Januari 2019\n" +
                        "Penerbit : Gagas Media\n" +
                        "Penulis : Wulan Fadila Fatia\n" +
                        "Panjang : 20 cm\n" +
                        "Lebar : 14 cm\n" +
                        "Berat : 0.3 kg\n" +
                        "ISBN : 9789797809058\n" +
                        "Bahasa : Indonesia"),

            NovelClass(
                R.drawable.novel3,
                novelname = "Sadena dan Sandra",
                noveldate = "Tanggal Terbit: \n17 Mei 2019",
                novelauthor = "Pengarang: \nWulan Fadila Fatia",
                novelrate = "Rating: (5,0)",
                ratingbar = 5.0,
                noveldesc = "Deskripsi: Sandra hanya memiliki satu keinginan, yaitu menjadi aktris film. Meskipun dia ditolak berkali-kali, itu tidak menghentikannya untuk mencoba. Hingga akhirnya, proyek film King, Queen, and Secret membuka peluang baru bagi Sandra untuk mencoba kembali. Kali ini Sandra berhasil mendapatkan peran Regina dalam proyek tersebut, namun dia harus berhadapan dengan Sadena, yang mendapat peran Raja. Ia merupakan seseorang dari masa lalunya yang Sandra tidak ingin mengingat lagi.\n" +
                        "Sadena hanya memiliki satu keinginan, yaitu terbebas dari seluruh masa lalu yang ada di pundaknya. Hidup Sadena berubah setelah menjadi seorang aktris. Dia mendapatkan popularitas, pasangan ideal, dan teman setia. Tapi semuanya tampak biasa saja, karena dua tahun lalu dia memutuskan untuk meninggalkan seseorang: Sandra. Hingga akhirnya, takdir membawa mereka ke sebuah proyek film yang sama. Sadena tidak menunggu lebih lama lagi. Mungkin ini adalah kesempatannya untuk menebus masa lalu.\n" +
                        "Format: Soft Cover\n" +
                        "Penulis: Wulan Fadila Fatia\n" +
                        "Tanggal Terbit: 17 Mei 2019\n" +
                        "ISBN: 9786025508875\n" +
                        "Penerbit: Coconut Books\n" +
                        "Jumlah Halaman: 400\n" +
                        "Bahasa: Indonesia\n" +
                        "Genre: Novel romance\n" +
                        "Berat: 0.5 kg\n" +
                        "Lebar: 14 cm\n" +
                        "Panjang: 20.5 cm"),


        NovelClass(
        R.drawable.novel4,
        novelname = "NKCTHI-Nanti KIta Cerita Tentang Hari Ini",
        noveldate = "Tanggal Terbit: \n27 Oktober 2018",
        novelauthor = "Penulis: \nMarchella FP",
        novelrate = "Rating: (5,0)",
        ratingbar = 5.0,
        noveldesc = "Deskripsi:Nanti kita cerita tentang hari ini... Besok kita buat yang lebih baik lagi.\" @nkcthi\n" +
                "Buku visual grafis, yang menceritakan tentang perempuan bernama Awan (27th) yang takut akan lupa rasanya menjadi muda, jadi dia membuat surat yang dia kirim untuk masa depan. Sebagai pengingat untuk dia dan anaknya kelak.\n" +
                "SKU: GRMK-003\n" +
                "Penulis: Marchella FP\n" +
                "ISBN: 9786024248215\n" +
                "Berat: 303 Gram\n" +
                "Dimensi (P/L/T): 15 Cm / 18 Cm/ 0 Cm\n" +
                "Halaman: 200\n" +
                "Jenis Cover: Hard Cover"),


        NovelClass(
        R.drawable.novel5,
        novelname = "Kata",
        noveldate = "Tanggal Terbit: \nNovember 2018",
        novelauthor = "Pengarang: \nRintik Sedu",
        novelrate = "Rating: (5,0)",
        ratingbar = 5.0,
        noveldesc = "Deskripsi: Sandra hanya memiliki satu keinginan, yaitu menjadi aktris film. Meskipun dia ditolak berkali-kali, itu tidak menghentikannya untuk mencoba. Hingga akhirnya, proyek film King, Queen, and Secret membuka peluang baru bagi Sandra untuk mencoba kembali. Kali ini Sandra berhasil mendapatkan peran Regina dalam proyek tersebut, namun dia harus berhadapan dengan Sadena, yang mendapat peran Raja. Ia merupakan seseorang dari masa lalunya yang Sandra tidak ingin mengingat lagi.\n" +
                "Sadena hanya memiliki satu keinginan, yaitu terbebas dari seluruh masa lalu yang ada di pundaknya. Hidup Sadena berubah setelah menjadi seorang aktris. Dia mendapatkan popularitas, pasangan ideal, dan teman setia. Tapi semuanya tampak biasa saja, karena dua tahun lalu dia memutuskan untuk meninggalkan seseorang: Sandra. Hingga akhirnya, takdir membawa mereka ke sebuah proyek film yang sama. Sadena tidak menunggu lebih lama lagi. Mungkin ini adalah kesempatannya untuk menebus masa lalu.\n" +
                "Format: Soft Cover\n" +
                "Penulis: Wulan Fadila Fatia\n" +
                "Tanggal Terbit: 17 Mei 2019\n" +
                "ISBN: 9786025508875\n" +
                "Penerbit: Coconut Books\n" +
                "Jumlah Halaman: 400\n" +
                "Bahasa: Indonesia\n" +
                "Genre: Novel romance\n" +
                "Berat: 0.5 kg\n" +
                "Lebar: 14 cm\n" +
                "Panjang: 20.5 cm"),

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = NovelAdapter(this,NovelList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}