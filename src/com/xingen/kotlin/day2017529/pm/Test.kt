package com.xingen.kotlin.day2017529.pm

/**
 * Created by ${新根} on 2017/5/29 0029.
 * 博客：http://blog.csdn.net/hexingen
 */

private fun  test1(){}
public var v="任何地方都可以见"
private var  v2="只有在本源文件中可见"
internal  val v3="同一模块下可见"

fun main(args: Array<String>) {
    Test().test()
}
open  class BaseTest{
    private val a="该属性不能被子类访问"
    protected var b="该属性能被子类访问"
    internal var c="同一模块下被访问"
    var d="到处都可以被访问"
}
class Test:BaseTest(){
    fun  test(){
        println(b)
        println(c)
        println(d)
    }
}