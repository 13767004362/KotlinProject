package com.xingen.kotlin.day2017528



/**
 * Created by ${新根} on 2017/5/28 0028.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(args: Array<String>) {
    var instance=Test<String>("定义一个泛型类")
    instance.test()
    //当可以推断出泛型中的类型，例如：从构造函数的参数等，可以省略指定参数类型。
    Test(1).test()




}

/**
 * 定义一个泛型类，和泛型属性
 */
class Test<T>(var t:T) {
    fun  test(){
        println(t)
    }
}
