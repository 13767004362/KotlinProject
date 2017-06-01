package com.xingen.kotlin.day2017526

/**
 * Created by ${新根} on 2017/5/26 0026.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {
    var instance = Test2015526()
    println(instance.property)
    println(instance.propertyIml)

    instance.test()
    instance.test1()
}

class Test2015526 : TestInterface {

    override val property: String get() = "实现类定义接口中属性的实现"

    override fun test1() {
        println("在实现类中重写接口方法 ")
    }
}

/**
 * 自定义一个接口
 */
interface TestInterface {
    /**
     * 抽象的属性
     */
    val property: String

    /**
     *  访问器（这里指的是属性的get()）的实现，即抽象属性的实现
     */
    val propertyIml: String get() = "接口内部定义属性的实现"

    /**
     *  方法的实现
     */
    fun test() {
        println("输出自定义的接口方法 ")
    }

    /**
     * 抽象方法
     */
    fun test1()
}