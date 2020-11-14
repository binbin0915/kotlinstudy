//如果 primary 构造方法的所有参数都有默认值，则编译器还会生成一个额外新的无参数构造方法，并且使用这个构造方法的默认值
class Person2 (private val name: String = "ruoshui",
               private var age: Int = 20,
               private var address: String = "zhuhai") {
    fun print() {
        println("name: ${this.name}, age: $age, address: $address")
    }
}

class Person3 (private val name: String = "ruoshui",
               private var age: Int) {
    fun print() {
        println("name: ${this.name}, age: $age")
    }
}

/**
运行输出值为：
name: ruoshui, age: 20, address: zhuhai
name: ruoshui, age: 12
 */
fun main() {
    var person = Person2()
    person.print()
    //因为 primary 构造方法参数默认值不全，所以不能使用无参构造
    var person1 = Person3(age = 12)
    person1.print()
}
