package com.xingen.kotlin.day2017531


/**
 * Created by ${新根} on 2017/5/31 0031.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {

    Test.instance.test()
    Test.test1()
}
class  Test {
     fun test() {
         println("伴生对象的静态调用对象，通过对象再调用方法")
    }
    companion object  Factory{ // 伴生对象
        var instance =Test()
        fun  test1(){
            println("伴生对象的静态调用方法")
        }
    }
}