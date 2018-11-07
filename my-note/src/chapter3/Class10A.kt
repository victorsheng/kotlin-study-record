package chapter3

//访问修饰符
// private,protected,public,internal
//internal 一个模块内可以访问module
//
//
//没有静态方法-->伴生对象,vm static注解
//
//
//
//
//
//
//
//
//
//
//
//

class StringUtils {
    companion object {
        fun isEmpty(str: String): Boolean {
            return "".equals(str);
        }
    }
}

fun main(args: Array<String>) {
    print(StringUtils.isEmpty("123"));
}


//单例的声明方式
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance;
        }


    }

    private object Holder {
        val instance = Single();
    }
}