open class Parent
class Children: Parent()

fun Parent.method() = "parent"
fun Children.method() = "children"

/**
运行结果：
parent
children
parent
调用只取决于对象的声明类型，而不是运行实际类型
 */
fun main() {
    val tmp1 = Parent()
    println(tmp1.method())
    val tmp2 = Children()
    println(tmp2.method())
    val tmp3: Parent = Children()
    println(tmp3.method())
}
