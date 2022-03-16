package `Elemen Program Kotlin`

fun main(args: Array<String>) {
//nilai ASCII
    var c: Char // character
    var i: Int // nilai ordinal (ASCII) dari karakter
// Mengkonversikan dari text menjadi sebuah nilai ASCII
    c = 'a'
    i = c.toInt()
    println("Karakter $c dikonversi ke nilai ASCII-nya yaitu $i")
// Mengkonversikan dari sebuah nilai ASCII ke text
    i = 98
    c = i.toChar()
    println("Nilai ASCII dari $i dikonversi ke nilai tekstualnya yaitu $c")
}
