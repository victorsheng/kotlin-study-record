package chapter2

//高阶函数
//没有返回值的函数 Unit
fun main(args: Array<String>): Unit {
    //当lambda作为函数的最后一个函数,可以写在()外面
    onlyIf(true) {
        print("hhhh")
    }

    val function: () -> Unit

    function = runnable::run

    onlyIf(true, function)
}

inline fun onlyIf(isDebug: Boolean, function: () -> Unit) {
    if (isDebug) function();
}


var runnable = Runnable { print("Runable:run") }


//匿名内部类
//使用inline修饰方法,减少匿名内部类,直接变成语句的调用,而不是匿名内部类
// 增加编译器的符合 只会给高阶函数 使用inline
