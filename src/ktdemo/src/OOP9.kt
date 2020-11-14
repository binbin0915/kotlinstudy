//【工匠若水 加微信 yanbo373131686 联系我，关注微信公众号：码农每日一题  未经允许严禁转载 https://blog.csdn.net/yanbober】

sealed class Option
class AddOption: Option()
class SubOption: Option()

fun option(num1: Int, num2: Int, opt: Option) = when (opt) {
    is AddOption -> num1 + num2
    is SubOption -> num1 - num2
    //可以省略 else，因为 'when' is exhaustive so 'else' is redundant here
    //else -> num1 * num2
}

/**
运行结果：
3
-1
 */
fun main() {
    println(option(1, 2, AddOption()))
    println(option(1, 2, SubOption()))
}
