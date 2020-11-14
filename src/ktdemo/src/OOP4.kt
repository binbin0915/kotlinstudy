//【工匠若水 加微信 yanbo373131686 联系我，关注微信公众号：码农每日一题  未经允许严禁转载 https://blog.csdn.net/yanbober】

class Yan {
    //TestObj 名字可以省略，编译器默认名字是 Companion
    //一个类中最多只能有一个伴生对象
    companion object TestObj {
        var name: String = "666"
        fun method() = println("${this.name} -- method")
    }
}

/**
运行输出值为：
666 -- method
777 -- method
class cn.yan.test.Yan$TestObj
 */
fun main() {
    Yan.TestObj.method()
    //简写，kotlin 语法糖，没有 @jvmStatic 情况下本质还是转为了 Yan.TestObj 静态成员调用方式
    Yan.name = "777"
    Yan.method()
    println(Yan.TestObj.javaClass)
}
