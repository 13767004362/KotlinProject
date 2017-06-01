package com.xingen.kotlin.day2017523

fun main(str: Array<String>) {
    Test<String>("本类是").test()

}
class Test<T> : BaseTest<T> {
     var t :T?=null
    constructor(t:T)  :super(t) {
      this.t=t
    }
    /**
     * 复写父类中的方法
     */
    override fun test() {
        println("$t Test子类 ")
        super.test()
    }
}
/**
 * 自定义父类
 */
open class BaseTest<T> {
   private  var  t:T?=null
   constructor(t:T){
        this.t=t
    }
    open fun test() {
        println("$t BaseTest父类 ")
    }
   fun closeTest(){
        println("父类中不能被子类重新复写的方法")
   }
}

