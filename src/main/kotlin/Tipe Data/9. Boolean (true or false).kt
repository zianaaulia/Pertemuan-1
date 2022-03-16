package `Tipe Data`

fun main(args: Array<String>) {
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)

    /*
    Kode dibawah ini salah karena type yang diinginkan boolean
    namun yang ditemui type int
     */
/*
var varInt : Int = 1
if(varInt)
println("varInt bernilai " + varInt)
*/
}

/*
Tipe Boolean mewakili objek boolean yang dapat memiliki dua nilai: benar dan salah.
Boolean memiliki mitra nullable Boolean? yang juga memiliki nilai nol.
Operasi bawaan pada boolean meliputi:
|| – disjungsi (logis ATAU)
&& – konjungsi (logis DAN)
! - negasi (tidak logis)
|| dan && bekerja dengan malas.
 */