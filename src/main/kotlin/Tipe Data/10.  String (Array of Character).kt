package `Tipe Data`

fun main(args: Array<String>) {
    val myName: String = "Ziana Aulia"
    for(chr in myName){
        print(chr)
    }
    print('\n')
    /*
    Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +,
    sehingga tipe data yang digabung otomatis akan melebur kedalam String.
    */
    val s = "abc" + 1
    println(s + "def")
    /*
    Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    raw String yang dipisahkan dengan triple quotes (""").
     */
    var text1 = """
        for (c in "foo")
        print(c)
    """
    println(text1)
    /*
    Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String seperti contoh kode
    program berikut:
     */
    var text2 = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()
    println(text2)
}

/*
String merupakan array dari karakter dan bersifat immutable (bersifat statis). Elemen suatu
String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.
 */


