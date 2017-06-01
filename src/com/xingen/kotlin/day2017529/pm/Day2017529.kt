package com.xingen.kotlin.day2017529.pm

/**
 * Created by ${新根} on 2017/5/29 0029.
 * 博客：http://blog.csdn.net/hexingen
 */
fun main(args: Array<String>) {
   println(test1(1))
    test2(-1)
    test3(4)
    test4(listOf("1","2","3"))
    test5(2)
}

/**
 *  if 语句作来实现Java 中三元运算符(condition ? then : else)的效果，
 *  但是必须要有else分支。
 *
 *  Kotlin编程中没有三元运算符。
 */
fun test1(i: Int): Int {
    var v = if (i > 0) i else 0 //可以理解为if(i>0) { i}  else { 0 }，if 语句中单个表达式时候，大括号可以省略。
    return v
}

/**
 * if表达式作为块，可以包含其他表达式，但最后一个表达式是该块的值。
 */
fun test2(i: Int) {
    var v = if (i > 0) {
        println("i的值大于0")
        i
    } else if (i==0) {
        println("i的值等于0")
        0
    }else{
        println("i的值小于0")
        i
    }
}

/**
 *  when表达式有参数：实现switch()语句效果
 *  when表达式无参数： 实现if -else if-else语句效果
 */
fun test3(obj: Any): String {
    var  v=when(obj){
        1->"1"  //是否等于1
        in 2..3->"2到3区间内"  //是否在2到3的范围内
        is String->"字符串类型"  //是否是String类型数据
        else->{
            println("默认情况，默认返回0")
            "0"
        }
    }
    return  v
}

/**
 *  for 循环
 */
fun test4(list: List<String>){
      //for（）中的条件等同于 i in list.indices，采取判断角标是否在某个数值区间内。
   for (i in 0..list.lastIndex){
         println("集合中$i 角标的数据是："+list[i])
   }
    //类似java中增强for循环
    for (item in list){
        println("每次遍历的数据是："+item)
    }
    //迭代器中的索引和对应值
    for ((index,values) in list.withIndex()){
        println("使用withIndex方式：集合中$index 角标的数据是：$values")
    }

}
/**
 *  while语句和do...while语句
 */
fun  test5(i: Int){
    var index=i
    //再利用do...while恢复到原本值
    do {
        println("do while语句每次输出index的值:$index")
        index --//自减
    }while (index>0)

    //先利用while循环输出到0
    while (index<=i){
        println("while语句每次输出index的值:$index")
        index++//自减1
    }
}