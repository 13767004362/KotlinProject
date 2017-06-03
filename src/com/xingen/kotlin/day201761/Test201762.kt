package com.xingen.kotlin.day201761

/**
 * Created by ${新根} on 2017/6/2 0002.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(args: Array<String>) {
      var oldList= arrayListOf<Int>(1,2,3)
      var newList=oldList.transform { item->item*2 }
      println(newList)
}

/**
 *  高阶函数在运行时候，由于每个函数是一个对象，它能捕获闭包，存在内存分配，导致额外开销内存。
 *
 *  大多数情况下，采用内联文本函数来避免这种情况。
 *
 *  inline标记会影响到被标记的函数，同时也影响到传递进来的Lambda函数，它们都将被关联到调用点中。
 *
 */
inline fun <T> List<T>.transform(transformFun:(T)->T):List<T>{
    var  newList= arrayListOf<T>()
    for (item in this){
        newList.add(transformFun(item))
    }
    return  newList
}

