package com.xingen.kotlin.day2017524

/**
 * Created by ${新根} on 2017/5/24 0024.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(str: Array<String>) {
    test( BaseClass.Test1() )
    test( BaseClass.Test2() )
    test( BaseClass.Test3 )
}

/**
 * 使用when表达式
 */

fun test(instance: BaseClass)=when(instance){
    is BaseClass.Test1 -> instance.test()
    is BaseClass.Test2 -> instance.test()
    is BaseClass.Test3 ->instance.test()
}
/**
 *
 * sealed修饰符修饰密封类。
 *
 * 密封类内部含有多个子类。
 */
sealed class BaseClass {

    class Test1 : BaseClass() {
        override fun test() {
            println("Test1实例")
        }

    }
    class Test2 : BaseClass() {
        override fun test() {
            println("Test2实例")
        }
    }
    object Test3 : BaseClass() {
        override fun test() {
            println("Test3实例")
        }
    }
    open fun test() {
        println("BaseClass实例")
    }
}