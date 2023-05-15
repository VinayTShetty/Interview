Singleton class in Kotlin Example.
**********************************

object MySingleton {
    init {
        // Initialization code
    }

    fun doSomething() {
        // Method implementation
    }
}
*****************************************************************************************************
Inline Function
***************
An Inline function is a kind of function that is declared with the keyword "inline" just before the function declaration.
 Once a function is declared inline, the compiler does not allocate any memory for this function.
instead the compiler copies the piece of code virtually at the calling place at runtime

fun main() {
   
    myInlineDemo({ println("Passing Lambda as argument")})
}


inline fun myInlineDemo(mylamb:()->Unit){
    mylamb()
    println("MyInlineDemo")
}  
*****************************************************************************************************
Kotlin allows some functions to be called without using the period and brackets.
These are called infix methods, and their use can result in code that looks much more like a natural language.

fun main() {
    val kotlin = "🙂"
    println(kotlin)
    val test=Test()
    test myInfixDemo "Vinay"
}


class Test{
 
  infix  fun myInfixDemo(name:String){
        println(name)
    }
        
}
*****************************************************************************************************

Extension Function
******************

fun main() {
    var student=Student()
    println("Pass-->"+student.isPass(20))
    println("Distinction-->"+student.isDistinction(80))
}

fun Student.isDistinction(marks:Int):Boolean{
    return marks>80
}

class Student{

    fun isPass(marks:Int):Boolean{
        return marks>35
    }
}
*****************************************************************************************************