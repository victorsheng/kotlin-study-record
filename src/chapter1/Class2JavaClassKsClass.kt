package chapter1

import kotlin.reflect.KClass

//clazz.simpleName


//KCLass


fun testClass(clazz: Class<Class2>) {

}

fun testClass(clazz: KClass<Class2>) {

}

fun main(args: Array<String>) {
    testClass(Class2::class);
    testClass(Class2::class.java);
    println(Class2.`in`)
}

