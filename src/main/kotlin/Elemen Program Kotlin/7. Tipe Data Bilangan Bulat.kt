package `Elemen Program Kotlin`

fun main(args: Array<String>) {
    println("Penggunaan Tipe Data bilangan bulat")
    val minByte: Byte = -128
    val maxByte: Byte = 127 // Batas maksimal nilai maxByte adalah 127(2^7 - 1) jika lebih maka akan terjadi error.
    val minShort: Short = -32767
    val maxShort: Short = 32767
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
}