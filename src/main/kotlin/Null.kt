fun main() {
    val text : String? = null
    println(text)

    if (text != null){
        var textLength = text.length
        println(textLength)
    }


    /*Safe Calls dan Elvis Operator

       Safe Calls
       seperti namanya, safe call akan menjamin kode yang kita tulis aman dari NullPointerException.
       Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.)
       saat mengakses atau mengelola nilai dari objek nullable. Seperti ini:

       Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
     */

    val test : String? = null
    test?.length

    /*Elvis operator (?:)
      Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
     */

    val test2 : String? = null
    val test2Lengths = test2?.length ?: 8

    //sama dgn menggunakan if else
    val test2Length = if(test2 != null) test2.length else 7


}