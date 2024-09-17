package id.ac.polbeng.depandi.test_kelas

//class Greeter {
//    fun greet() {
//        println("Hello object world!")
//    }
//}

//Kode untuk menambahkan class member
class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello object world!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String{
        return "$text $name"
    }
}

