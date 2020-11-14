class Do(name: String, address: String) {
    //定义只读属性
    val name: String
        get() = "gongjiang"
    //定义可读可写属性
    var address: String = address
        get() {
            println("get address")
            return field
        }
        set(value) {
            println("set address")
            //这里不能用 this.address = value，否则死循环
            field = value
        }
}

/**
运行结果：
gongjiang
set address
get address
hanzhong
 */
fun main() {
    val dx = Do("yb", "zhuhai")
    //本质调用的 name 属性的 get 方法
    println(dx.name)
    dx.address = "hanzhong"
    println(dx.address)
}
