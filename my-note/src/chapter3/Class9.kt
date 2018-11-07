package chapter3

// 类的声明 父类any
open class A {}
class B : A(){}

//kotlin默认 public final的 so 被继承的类需要加 open

//主构造函数(类名后),副构造函数(constructor 关键字)