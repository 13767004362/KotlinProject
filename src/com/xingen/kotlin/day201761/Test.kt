package com.xingen.kotlin.day201761

/**
 * Created by ${新根} on 2017/6/1 0001.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {

    var oldlist = arrayListOf<Int>(1, 2, 3)
    println("原本数据是 $oldlist")

    /**
     *  面向函数：类似Java8中lambda表达式，传入一个函数对象。
     *  lambda表达式的形式： { 参数名 -> 函数体 }
     *  这里的item是参数，返回值item+3是函数体
     *
     *  注意点：List.transform（）是带有括号的，
     *  但是在Kotlin编程中方法最后一个参数是函数，且传入lambda表达式作为参数的话，函数的括号可以省略，
     *  因此，是这里是List.transform{ lambda表达式 }
     */

    var newList = oldlist.transform { item -> item + 3 }
    println("转换后的新数据是 $newList")

    println(  total1(1,2)  )
    println(total2(1,2))

    println(test3(1,2))

    println(i)
    test4(1,2)
    println(1)


    println(test5(1,2))

    println( 1.test6(2) )
    println( 1.test7(2) )
}

/**
 * 给List 类定义一个扩展函数transform() ,
 * 然后使用高阶函数，其中方法参数是一个函数
 */
fun <T, R> List<T>.transform(transformFun: (T) -> R): List<R> {
    //创建一个新的List对象，用于装载转换后的item
    var result = arrayListOf<R>()
    /**
     * 类似java中增强for循环。
     * 扩展函数中的this指向接受者对象，也就是该调用扩展函数的对象
     */
    for (item in this) {
        var newItem = transformFun(item)// 调用参数中的函数方法进行转换新的item.
        result.add(newItem)
    }
    return result
}

/**
 * 一个完成的Lambda表达式
 */
var total1={x:Int,y:Int->x+y}

/**
 * 带有可选标注的Lambda表达式,使文档化每个参数的含义
 */
var total2:(Int,Int)->Int={  x,y   ->   x+y }

/**
 * 匿名函数，没有名字，其他语法和常规函数类似
 *
 * 声明一个匿名函数，这里用表达式来表示函数体
 */
var test3= fun(x:Int,y:Int):Int=x+y

var i=0
/**
 * 声明一个匿名函数，这里用代码块来表示函数体
 */
var test4= fun(x:Int,y:Int):Int{
    i++
    return  x+y
}
/**
 * 声明一个匿名函数，当返回值类型可以推断出，可以省略
 */
var test5= fun(x:Int,y:Int)=x+y



/***
 * 带有接受者的Lambda表达式
 *
 * 这里的函数类型是一个带有接受者的类型：
 *
 * test6:Int.(other:Int)->Int
 */
var test6:Int.(other:Int)->Int={ other->other+1}
/**
 * 带有接受者的匿名函数
 *
 * 用表达式表达式函数体：
 *
 * var test7=fun Int.(other:Int):Int=this+other
 *
 * 这里， 用代码块表示函数体，来声明一个匿名函数，最后赋给一个变量
 */
var test7=fun Int.(other:Int):Int{
    return this+other   //this是指向接受者的对象
}
