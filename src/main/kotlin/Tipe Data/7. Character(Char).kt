package `Tipe Data`


/*
fun main(args: Array<String>) {
var charA : Char = 'A'
println(charA == 65)
}
*/

/*
Terdapat error pada kode program diatas karena penggunaan
operator == tidak bisa digunakan pada tipe data char dan integer
*/

//Kode Program penggunaan fungs anggota dari Character:

fun main(args: Array<String>) {
    var charA : Char = 'A'
//println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}

