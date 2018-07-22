package chapter2

// lambda 语法,闭包
//kotlin 箭头在 {} 里面, 无参数可以省略箭头
//
//

//闭包
var echo = { name: String -> println(name) }

//编译成 Function1<String,Unit> echo=(Function1)echo.INSTANCE

fun main(args: Array<String>) {
    echo("hello")
}

// 参数限制 <=22个参数
// 自己扩展function23
// 无法以kotlin进行声明