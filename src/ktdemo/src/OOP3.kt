//【工匠若水 加微信 yanbo373131686 联系我，关注微信公众号：码农每日一题  未经允许严禁转载 https://blog.csdn.net/yanbober】

//默认 class 是 final 的，需要显式添加 open 以便可以被继承
open class Anim (name: String, age: Int)

//kotlin 通过 : 实现 java 的 extends 等关键字
class Dog (name: String, age: Int): Anim(name, age)

//kotlin 中如果一个类没有 primary 构造方法，
//则这个类的每个 secondary 构造方法就需要通过 super 关键字来初始化父类型，
//或是通过其他 secondary 构造方法完成这个任务。
//不同的 secondary 构造方法可以调用父类型不同的构造方法。
open class Anim1 (name: String) {
    init {
        println("Anim1--$name")
    }
}

class Dog1 : Anim1 {
    constructor(name: String): super(name) {
        println("dog1-0--$name")
    }

    constructor(name: String, age: Int): this(name) {
        println("dog1-2--$name")
    }
}

/**
运行输出值为：
Anim1--666
dog1-0--666
dog1-2--666
 */
fun main() {
    var anim = Dog1("666", 66)
}
