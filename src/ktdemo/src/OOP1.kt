//【工匠若水 加微信 yanbo373131686 联系我，关注微信公众号：码农每日一题  未经允许严禁转载 https://blog.csdn.net/yanbober】

class Person constructor(name: String) {
    private var name: String
    private var age: Int
    private var address: String

    init {
        println("init,$name")   //name 是 constructor 构造方法的参数
        this.name = name
        this.age = 16
        this.address = "zhuhai"
    }
    //secondary 构造方法必须要直接或者间接调用其 primary 构造方法
    constructor(name: String, age: Int): this(name) {
        println("$name, $age")
        this.name = name
        this.age = age
        this.address = "hanzhong"
    }
    //secondary 构造方法间接调用其 primary 构造方法
    constructor(name: String, age: Int, address: String): this(name, age) {
        this.address = address
    }

    fun print() {
        println("name: ${this.name}, age: $age, address: $address")
    }
}

/**
运行输出值为：
ruoshui
gongjiang
gongjiang, 18
android
android, 19
name: ruoshui, age: 16, address: zhuhai
name: gongjiang, age: 18, address: hanzhong
name: android, age: 19, address: guangdong
 */
fun main() {
    var person0 = Person("ruoshui")
    var person1 = Person("gongjiang", 18)
    var person2 = Person("android", 19, "guangdong")
    person0.print()
    person1.print()
    person2.print()
}
