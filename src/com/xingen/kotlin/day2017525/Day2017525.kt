package com.xingen.kotlin.day2017525

/**
 * Created by ${新根} on 2017/5/25 0025.
 * 博客：http://blog.csdn.net/hexingen
 */


fun main(str: Array<String>) {

    /*  Constant.instance = Test2015525()

      println(Constant.instance.name)
      println(Constant.instance.time1)
      println(Constant.instance.time2)

      Constant.instance.time2=Constant.spare
      println(Constant.instance.time2)*/

    Constant.instance = Test2015525()
    println(Constant.instance.name)
    println(Constant.instance.time1)


}


class Test2015525 {

    /**
     * 一个属性的声明形式：
     *
     *      var 属性名 ：属性的类型 = 初始化的值
     *                   get( ){  return 值   }
     *                   set( 初始化的值 ){    }
     *
     * 注意点：
     * 1. 若是属性类型可以从初始化语句，或者函数返回值类型中推断出来，属性的类型可以省略不写。
     * 2. set()和get()是可以省略的.
     *
     * 类似Java中属性的私有化
     */

    /**
     *  初始化的值 ,会直接直接写入备用字段field.，不会调用set()
     */
    var time2: String = "2015524"
        get() {
            return field  //这里是返回备用字段
        }
        set(value) {   //这里的values是指属性被重新赋予的新值
            if (value.toInt() < 2015526) {
                field=value
            }else{  //当赋值的Int类型 大于等于2015526field被赋予一个默认的字段，备用字段"2015526"。
                field="2015526"
            }
        }

    /**
     * var关键字声明可变属性，默认实现了 get()和set()
     */
    var name: String = title
    /**
     * val关键字声明只读属性 ，不具备set() , 包含的get()可以省略。
     */
    val time1: String get() {
        return Constant.constant
    }
    val time3: String get() {
        return Constant.spare
    }


}

/**
 * const修饰包级别只读变量，作为常量使用。
 */
const val title = "Test2015525"

object Constant {
    /**
     * const修饰一个Object类中的val变量，作为常量使用
     */
    const val constant = "2015525"



    /**
     * 作为备用属性，被其他属性引用。
     */
    val spare: String  by lazy {
        val v = constant.toInt() + 1
        v.toString()
    }

    lateinit var instance: Test2015525
}