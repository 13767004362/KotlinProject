package com.xingen.kotlin.day2017527
/**
 * Created by ${新根} on 2017/5/28 0028.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {
    var  instance  =Test2017527()

    printTest( instance)

    instance.test1()

    instance.test1("Test2017527的重载方式实现同名的扩展函数")

    var testInstance:Test2017527?=null
     println(  testInstance.toString() )

}

/**
 * 通过对象来调用扩展函数
 */
fun printTest(t:BaseTest){
    println( t.test() )
}
open class  BaseTest{}
class  Test2017527:BaseTest(){
   fun  test1(){
       println("Test2017527的成员函数")
   }
}
/**
 * 父类和子类都定义同名的扩展函数
 */
fun  BaseTest.test()="BaseTest.test()"
fun  Test2017527.test() ="Test2017527.test()"
/**
 * 定义类中的同名扩展方法
 */
fun  Test2017527.test1(){
    println("Test2017527的同名扩展函数")
}

/**
 * 采用重载的方式，定义类中的同名扩展函数
 */
fun  Test2017527.test1(str:String){
    println(str)
}

/**
 * 定义一个可空的接受者的扩展函数：空对象任然可以调用该扩展函数
 *
 * Any是超类,在toString()中检查是否为空的扩展函数。
 * 这样实现，全部类（Any的子类）在不知道对象是否为空下，可以调用toString()来说生成字符串。
 */
fun  Any?.toString():String{
    if (this==null){ //空指针检查
        return "对象为null"
    } else{
        return this.toString()
    }
}
