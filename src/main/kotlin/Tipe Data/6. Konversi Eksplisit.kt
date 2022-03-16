package `Tipe Data`

fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)
}

/*
 konversi secara implisit adalah ketika compiler mampu melakukan konversi
 tanpa perlu diberi instruksi apapun untuk melakukan konversi.
 Tidak semua konversi bisa dilakukan secara implisit
 */

/*
Konversi tipe ini dilakukan secara manual oleh sang programmer,
beda dengan implisit yang secara otomatis terkonversi oleh compiler.
Metode ini boleh atau biasa disebut type casting
 */