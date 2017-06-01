package com.xingen.kotlin.day2017527

/**
 * Created by ${新根} on 2017/5/27 0027.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(args: Array<String>) {
    Test().test()
}
/**
 *
 *
 *  对函数进扩展：
 *   在函数前面指定一个接受者，这里的接受者是MutabList<E>集合。
 *   为它扩展一个swap函数
 *  扩展函数的this指向接受者对象。
 *
 */
fun  <T> MutableList<T>.swap(x:Int,y:Int){
    //利用一个中间变量，互换之指定位置的值。
    val temp=this[x]
    this[x]=this[y]
    this[y]=temp
}

/**
 *
 * 使用中辍符号 infix来标记单个参数的扩展函数
 *
 * 好处，可以直接使用中辍注解来调用该扩展函数
 *
 */
infix  fun  Int.diminished(x:Int):Int{
    return  x.dec()  //数值自减
}
class Test {
   fun  test(){

       /**
        * 调用MutablListOf类的扩展方法swap( )
        */
       var  mutableList=mutableListOf("1",2,3)
        println(mutableList)
       //使用自定义的扩展函数
       mutableList.swap(0,2)
       println(mutableList)

       /**
        * 调用Int类的扩展方法diminished()
        */
       var normal=2
       println(normal)
       var instanceInt=1
       println(instanceInt.diminished(normal))

       //等同于 ，这里使用中缀符号的注解来调用函数   println(1 diminished 2)
    }
}