package com.xingen.kotlin.day2017529
/**
 * Created by ${新根} on 2017/5/29 0029.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {
    test()
    test1()

    TestListener.test()

    Day2017529.test()
}
/**
 * 测试有父类和接口的匿名类
 */
fun test() {
    var t = object : Test2017529("创建继承方式延伸的匿名内部类"), Test1Interface {
        override fun test() {
            println("创建接口延伸的匿名内部类")
        }
    }
    println(t.v)
    t.test()
}

/**
 * 测试无继承和实现的匿名类
 */
fun test1() {
    var t = object {
        var show: String = "没有父类的匿名类"
    }
    println(t.show)
}
/**
 * 创建一个父类
 */
open class Test2017529(str: String) {
    open var v = str
}
/**
 * 定义一个接口
 */
interface Test1Interface {
    fun test()
}

/**
 * object关键字声明一个单例的对象
 *
 *  对象声明与对象表达式区别：
 *
 *    对象声明和变量声明一样，不能作为右值赋给等号左边。
 *
 *  调用方式：
 *    1. 类名.属性名
 *    2. 类名.方法（）
 */
object  TestListener:Test1Interface {
    override fun test() {
      println("object声明类对象")
    }
}
class Day2017529{
    /**
     * companion object声明一个伴生对象，对象名可以省略。
     * 伴随对象中的方法可以作为静态方法使用
     *
     *  @JvmStatic标记，真实的静态方法和静态属性
     */
    companion object Test{
       @JvmStatic fun  test(){
            println("伴随对象的静态使用")
        }
    }
}