data class Data(var name: String, var age: Int)
class Data1(var name: String, var age: Int)

/**
编译运行
 */
fun main() {
    val data = Data("name", 12)
    val data1 = Data1("name1", 13)
    val (na, ag) = data
    println("name=$na, age=$ag")    //name=name, age=12
    //非 data class 默认不会生成 componentN 方法
//编译报错：Error:(435, 22) Kotlin: Destructuring declaration initializer of type Data1 must have a 'component1()' function
//    val (na1, ag1) = data1
//    println("name1=$na1, age1=$ag1")
}
