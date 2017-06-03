package com.xingen.kotlin.day201761

/**
 * Created by ${新根} on 2017/6/2 0002.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {

    test2 { change() }
}

/**
 *  嵌套for循环，指定跳转到最外层的for循环：
 *
 *  1. 自定义一个标签,xxx@
 *
 *  2. 在最外层的for循环中添加自定义的标签， 使用break@xxx或者continue@xxx，来转跳
 */
fun test1() {
    loop@ for (j in 0..10) {
        for (i in j..10) {
            if (i==5&&j == 5) {
                println("当外层值为 $j 内层值为$i， 使用break标签 跳出循环")
                break@loop
            } else {
                println("当外层值为 $j 内层值为$i，使用continue标签继续下一次循环")
                continue@loop
            }
        }
    }
}

/**
 * 高阶函数，接受一个函数作为参数
 */
inline fun test2(changeFun:()->Unit){
    changeFun()
    println("高级函数的Lambda表达式执行完")
}

var  list= listOf<Int>(1,2,3)
/**
 *  传入作为的参数的函数
 */
fun change(){
    /**
     * Lambda表达式，单个参数，时候可以省略声明参数和->
     *
     *  即以下代码等于：
     *      list.forEach {
     *          if (item==2) return
     *          println("当前遍历的值是 $item")
     *      }
     */

    list.forEach  {
         item->
          if (item==2) return@forEach
          println("当前遍历的值是 $item")
    }
    println("list集合遍历完成")
}


