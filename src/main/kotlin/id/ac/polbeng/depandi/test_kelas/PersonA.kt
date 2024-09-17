package id.ac.polbeng.depandi.test_kelas

class PersonA (_firstName: String, _lastName: String, _Age: Int) {
    var firstName : String
    var lastName : String
    var age : Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _Age
    }
}

fun main() {
    val budi = PersonA("Budi", "Gunawan",21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}