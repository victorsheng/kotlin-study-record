package chapter1

var age: Int = 11;
var age2 = 11;
//val 不可变的变量
var name: String = "victor";
val name2 = "victor";

//string是不能为空
//错误String和String?完全两种不一样的类型,不能相互赋值
//var name3: String=null;
var name4: String? = null;

fun main(args: Array<String>) {
    //string 不可为空
    //string? 可为空
//    chapter1.getName = chapter1.getName4!!;
//    chapter1.getName4 = chapter1.getName;
    printLen(name);


}

fun printLen(str: String): String {
    println(str)
    println("字符串是$str");
    return str

}