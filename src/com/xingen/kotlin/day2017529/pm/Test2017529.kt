package com.xingen.kotlin.day2017529.pm

import kotlin.properties.Delegates



/**
 * Created by ${新根} on 2017/5/29 0029.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {
   var b=BaseInterfaceImpl("一个类的被另外一个类所代理")
    Derived(b).test()
}
interface  BaseInterface{
    fun  test()
}
class BaseInterfaceImpl(var str:String):BaseInterface{
    override fun test() {
      println(str)
    }
}

/**
 *
 * 通过by从句，将b存储在Derived内部对象中
 * b对象可以调用BaseInterface中所有公开方法
 */
class Derived(b:BaseInterface):BaseInterface by b


class Test2017529{


    /**
     * 延迟代理
     */
    val d1:String by lazy {
        "代理"
    }
    /**
     * 非空代理
     */
    var d2:String by Delegates.notNull<String>()

}

