## Kotlin
```kotlin
package com.example.helloworld

fun main(){
    println("Hello World!")
}
```
## variable && data type

declare

val -> final
var -> non-final

```kotlin
var a: Int = 2

var a = 2   // auto
```

data type
java: basic, object
kotlin: object

## function

if
```kotlin
fun fun_name(para1: Int, para2: Int): Int{
    return 0;
}

fun largeNum(a: Int, b: Int): Int{
    return max(a, b)    // kotlin.math
}

fun largeNum(a: Int, b: Int): Int = max(a, b)
fun largeNum(a: Int, b: Int): = max(a, b)
```

## branch

```kotlin
fun largeNum(a: Int, b: Int): Int{
    var value = 0;
    if(a > b){
        value = a
    }
    else{
        value = b
    }
    return value;
}

fun largeNum(a: Int, b: Int): Int{
    val value = if(a > b){
        a
    }
    else{
        b
    }
    return value
}

fun largeNum(a: Int, b: Int): Int{
    return if(a > b){
        a
    }
    else{
        b
    }
}

fun largeNum(a: Int, b: Int) = if(a > b){
    a
}
else{
    b
}

fun largeNum(a: Int, b: Int) = if(a > b) a else b
```

when
```kotlin
fun getScore(name: String) = when(name){
    "Tom" -> 80
    "Amy" -> 95
    else -> 0
}

type match
fun checkNum(num: Number){
    when(num){
        is Int -> println("Int")
        is Double -> println("Double")
        else -> println("Number is not support")
    }
}

fun getScore(name: String) = when{
    name == "Tom" -> 80
    name == "Amy" -> 95
    else -> 0
}
```

## loop

val kotlin.while = java.while

for
```kotlin
val range = 0..10   //[0, 10]

for(i in 0..10){
    println(i)
}

val range = 0 until 10  //[0, 10)

for(i in 0 until 10 step 2){
    println(i)
}

val range = 10 downTo 1 //[10, 1]
```

## OOP
```kotlin
class Person{
    var name = ""
    var age = 0

    fun eat(){
        printf("%s is eating. He is %d years old.", name, age)
    }
}

val p = Person()
p.name = "Mark"
p.age = 21
p.eat()
```

```kotlin
open class Person(val name : String, val age : Int){              //default final
    fun eat(){
        printf("%s is eating. He is %d years old.", name, age)
    }
}

class Student(val sno : String, val grade : Int, name : String, age : Int) : Person(name, age){      // main constractor
    init {
        println("sno is " + sno)
        println("grade is " + grade)
    }
    constructor(name : String, age : Int) : this("", 0, name, age){

    }
    constructor() : this.("", 0){

    }
}

val stu = Student()                     // constructor 2
val stu = Student("Mark", 21)           // constructor 1
val stu = Student("000", 5, "Mark", 21) // main constructor
```