package chapter2

//高阶函数
//没有返回值的函数 Unit
fun main(args: Array<String>): Unit {
    //当lambda作为函数的最后一个函数,可以写在()外面
    onlyIf(true) {
        print("hhhh")
    }
}

fun onlyIf(isDebug: Boolean, function: () -> Unit) {
    if (isDebug) function();
}


var runnable = Runnable { print("Runable:run") }

var function: () -> Unit function = runnable::run