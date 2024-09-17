package id.ac.polbeng.depandi.test_kelas

import java.rmi.MarshalException

open class Teacher {
//    Must user "open" modifier to allow child classes to override it
    open fun teach() {
        println("Teaching...")
    }

    fun info() {
        println("I'am a Teacher.")
    }
}

class MathTeacher : Teacher() {
//    Must use "override" modifier to override a base class function
    override fun teach() {
        println("Teaching Maths...")
    }
}
//
fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}