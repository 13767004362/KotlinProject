package com.xingen.kotlin.day2017529

/**
 * Created by ${新根} on 2017/5/29 0029.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {

    /**
     * 调用嵌套类的方法
     */
    Test.Nested().nestedTest()

    var instance = Test()
    /**
     *     调用内部类的方法
     */
    instance.Inner().innerTest()
    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例。
     */
    instance.setInterFace(object : TestInterFace {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })

}

class Test {
    var v = "成员属性"

    /**
     * 一个在类中嵌套的类
     * 引用不到外层嵌套类的成员
     */
    class Nested {
        fun nestedTest() {
            println("类可以嵌套其他类中")
        }
    }
    /**
     * inner标记一个类是内部类
     * 可以引用外部类的成员
     * 采用this@类名方式，获取到外部类的this对象
     */
    inner class Inner {
        fun innerTest() {
            var t = this@Test //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + t.v)
        }
    }
    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}
/**
 * 定义接口
 */
interface TestInterFace {
    fun test()
}
