class Qq {
    //延迟初始化，不添加就必须初始化或者申明为 String? 类型
    lateinit var name: String
    //无法编译通过：Property must be initialized or be abstract
    //var age: Int

    //无法编译通过：'lateinit' modifier is allowed only on mutable properties
    //lateinit val address: String

    //无法编译通过：'lateinit' modifier is not allowed on properties of primitive types
    //lateinit var count: Int

    fun print() {
        println(name)
    }
}

/**
运行结果直接崩溃：
Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property name has not been initialized
at cn.yan.test.Qq.print(Test2.kt:324)
at cn.yan.test.Test2Kt.testRun(Test2.kt:337)
at cn.yan.test.Test2Kt.main(Test2.kt:22)
at cn.yan.test.Test2Kt.main(Test2.kt)
 */
fun main() {
    val qq = Qq()
    qq.name="binbin"
    qq.print()
}
