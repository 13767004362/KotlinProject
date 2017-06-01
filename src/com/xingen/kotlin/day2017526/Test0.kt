package com.xingen.kotlin.day2017526



/**
 * Created by ${新根} on 2017/5/26 0026.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(args: Array<String>) {
    var  instance= Test()
    println(instance.test1())
    println(instance.test2("有参数有返回值得方法"))
    println(instance.test3())
    instance.test4()
    println(instance.test5())
    println(instance.test6())
    println(instance.test7("可变参数1"))
    println(instance.test7("可变参数1","可变参数2"))
    println(instance.test8(2017526))
}
class  Test{

    /***
     *  方法的形式：
     *   fun 方法名 ( 参数名：参数类型 = 默认值 ,...) ：返回值类型{
     *        return 返回值
     *   }
     */
    fun test1() :String {
        return "无参数有返回值的方法"
    }
    fun test2(str:String) :String {
        return str
    }
    fun test3(str:String="方法参数的默认值"):String{
        return str
    }

    /**
     *  Unit修饰无返回值的方法。Unit也可以省略不写。
     */
    fun test4():Unit{
        println("无返回值的方法")
    }

    /**
     * 单表达式函数 ：
     *
     *  函数中只有单个表达式，可以省略大括号
     */
    fun  test5 ():String ="单个表达式的函数，大括号可以省略"
    fun  test6 () ="当能推断出返回值类型时候，返回值类型可以省略"

    /**
     * vararg标记可变长参数
     */
    fun <T> test7(vararg  ts:T):List<T>{
        val result=ArrayList<T>()
        for (t in ts){
            result.add(t)
        }
        return  result
    }
    /**
     *  方法包含方法
     */
    fun  test8(index :Int):Boolean{
        val  changIndex=index+1
        //定义一个内部方法
        fun test9(innerIndex:Int) :Boolean{
            return  innerIndex+1==changIndex
        }
        //获取内部定义的方法的返回值
       var  result=test9(index)

        return result
    }

}
