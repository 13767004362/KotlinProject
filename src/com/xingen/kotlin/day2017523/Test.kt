package com.xingen.kotlin.day2017523

/**
 * Created by ${新根} on 2017/5/31 0031.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(str:Array<String>){

    //创建类对象，调用其方法
    Test1<String>("Kotlin中类的声明","Kotlin编程中的二级构造方法").test()
}
/**
 * 用class关键字声明一个类，且带有以下特征：
 *
 * 1. 泛型类<T>
 *
 * 2.  带有指定参数类型的主构造方法 constructor(str:T)
 *
 */
class  Test1<T> constructor(str:T){
    //声明一个全局变量
    var t:T
    /***
     * init{}  代码块初始化全局属性
     */
    init {
        t=str
    }

    /**
     * 二级构造方法：
     *  1. 必需添加constructor关键字。
     *  2. 若是类的声明中有主构造方法，必需使用this（参数...）传递参数进行调用。
     */
    constructor(t1: T, t2:T ) : this(t2) {
        var t3="${t1}和${t2}"
        //输出两个参数，t1和t2的信息
        println(t3)
    }

    fun test(){
        //输入信息
        println(t)
    }
}