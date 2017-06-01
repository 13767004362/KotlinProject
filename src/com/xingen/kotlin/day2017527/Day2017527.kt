package com.xingen.kotlin.day2017527


/**
 * Created by ${新根} on 2017/5/28 0028.
 * 博客：http://blog.csdn.net/hexingen
 */

fun main(args: Array<String>) {
  var  list=listOf("1",2,"3")
    println(list.lastIndex)

    Day2017527.test()

    /**
     * 调用MutablListOf类的扩展方法swap( )
     */
    var  mutableList=mutableListOf("1",2,3)
    println(mutableList)
    //使用自定义的扩展函数
    mutableList.swap(0,2)
    println(mutableList)

}

/**
 * 属性扩展
 * 这里，给List扩展一个lastIndex的属性，但是不会真的作为成员属性。
 */
val  <T> List<T>.lastIndex:Int get(){
    //等同于get=size-1,这里返回最后一个元素的角标
    return  this.size-1
}

class Day2017527{
    companion object{
    }
}

/**
 * 伴随对象扩展：
 * 这里扩展一个方法
 */
fun  Day2017527.Companion.test(){
    println("伴随对象的扩展")
}