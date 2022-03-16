package `Tipe Data`

fun main(args: Array<String>) {
    val a = 7
    val b = 8
    val c = a + b
    val s = "Ketika kita tambah $a dan $b, maka akan dapat $c"
    println(s)
    println("Ketika kita tambah $a dan $b, maka akan dapat ${a + b}")
    val price = """
    ${'$'}9.99
    """
    println(price)
}

/*
Diperlukan tanda kurung kurawal untuk melakukan pemrosesan pada saat menggabungkan
variabel kedalam template String. Karakter dolar („$‟) tidak bisa dicetak menggunakan escape
character oleh karena itu gunakan template String untuk mencetaknya.
 */