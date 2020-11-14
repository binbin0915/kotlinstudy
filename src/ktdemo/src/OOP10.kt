//【工匠若水 加微信 yanbo373131686 联系我，关注微信公众号：码农每日一题  未经允许严禁转载 https://blog.csdn.net/yanbober】

interface InterfaceBase {
    fun print(i: Int)
}

abstract class AbsInterfaceBase {
    abstract val age: Int

    abstract fun printAbs()
}

/**
 * 使用样例
 */
fun main() {
    //继承接口的对象表达式
    var obj = object: InterfaceBase {
        override fun print(i: Int) {
            println("InterfaceBase i=$i")
        }
    }
    obj.print(10)

    //没有任何继承的对象表达式
    val obj2 = object {
        fun test() {
            println("obj2 test")
        }
    }
    obj2.test()

    //继承抽象类的对象表达式
    val obj3 = object: AbsInterfaceBase() {
        override val age: Int
            get() = 12

        override fun printAbs() {
            println("abs age=$age")
        }
    }

    obj3.printAbs();

    //同时继承抽象类、接口的对象表达式
    val obj4 = object: InterfaceBase, AbsInterfaceBase() {
        override val age: Int
            get() = 12

        override fun printAbs() {
            println("abs age=$age")
        }

        override fun print(i: Int) {
            println("interface age=$age, i=$i")
        }
    }

    obj4.print(888)
    obj4.printAbs()
}
