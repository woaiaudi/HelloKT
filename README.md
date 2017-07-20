# Kotlin 基本语法

### kotlin 文件/类
新建kotlin文件时如下图：

![](http://ogeijtkoy.bkt.clouddn.com/img170720.png)

分别创建了 File 和  Class  后，在IDE中视图如下

![](http://ogeijtkoy.bkt.clouddn.com/20170720165429.png)

当在class中添加main方法后变成如下状态：

![](http://ogeijtkoy.bkt.clouddn.com/20170720165706.png)

但是实际的文件，都是以kt为后缀名
添加main方法后，就可以执行这个文件了

kotlin main方法的使用，与Java不一样，看下图
void
![](http://ogeijtkoy.bkt.clouddn.com/20170720170039.png)

main 方法申明在file中，当作一个普通的函数。不像java main方法必须是psv（public static ）的

### 声明变量
- 只读  `val`
```
var hostIp = "192.168.0.2"
```
- 可变变量  `var`
```
var helloKT = HelloKT()
```

### 函数定义
```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

返回void
```
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
```
简写
```
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
```

### 可空变量
```
//返回可以为空的int
//str.toIntOrNull()  避免类型不匹配，报异常
fun parseInt(str: String): Int? {
  return str.toIntOrNull()
}
```

### For 循环
```
val items = listOf("apple", "banana", "kiwi")
```
- 简洁用法
```
for (item in items) {
    println(item)
}
```
- Index遍历
```
for (index in items.indices) {
    println("item at $index is ${items[index]}")
}
```

- 使用withIndex库函数
```
for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
}
```