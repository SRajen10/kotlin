package learning

import java.util.*

/*  1. fun is the keyword to create function
    2. main is the starting point of the program
    3. args is the arguments for the function
    4. Array<String> is the type of the argument */
fun main(args: Array<String>) {

    alignStatements(false)
    println("Hello World")
    alignStatements(true)

    /* Variables */
    alignStatements(false)
    varType()
    alignStatements(true)

    alignStatements(false)
    valType()
    alignStatements(true)

    /* Datatypes */
    alignStatements(false)
    dataTypes()
    alignStatements(true)

    /* Type Conversion */
    alignStatements(false)
    typeConversions()
    alignStatements(true)

    /* Operators */
    alignStatements(false)
    operators("ADD")
    operators("SUB")
    operators("MUL")
    operators("DIV")
    operators("MOD")
    operators("POST-INC")
    operators("PRE-INC")
    operators("POST-DEC")
    operators("PRE-DEC")
    operators("EQU")
    operators("NOT-EQU")
    operators("GREATER")
    operators("LESSER")
    operators("GREATER-EQU")
    operators("LESSER-EQU")
    operators("ADD")
    operators("OR")
    operators("NOT")
    alignStatements(true)

    alignStatements(false)
    strings("Santhosh")
    alignStatements(true)

    alignStatements(false)
    loops("IF")
    loops("IF-ELSE")
    loops("IF-ELSE-IF")
    loops("WHILE")
    loops("DO-WHILE")
    loops("FOR")
    alignStatements(true)

}

fun loops(loopType : String) {
    when(loopType) {
        "IF" -> ifLoop("SANTHOSH")
        "IF-ELSE" -> ifElseLoop("SANTHOSH".lowercase())
        "IF-ELSE-IF" -> ifElseIfLoop("SANTHOSH")
        "WHILE" -> whileLoop()
        "DO-WHILE" -> doWhile()
        "FOR" -> forLoop()
        else -> println("Nothing matched")
    }
}

fun forLoop() {
    println("Below is the output from FOR loop")
    for(i in 1..10) {
        print("${i} ")
    }
    printNewLine()
}

fun doWhile() {
    println("Below is the output from DO-WHILE loop")
    var i : Int = 0
    do {
        print("${i} ")
        i++
    } while (i < 10)
    printNewLine()
}

fun whileLoop() {
    println("Below is the output from WHILE loop")
    var i : Int = 0
    while(i < 10) {
        print("${i} ")
        i++
    }
    printNewLine()
}

fun ifElseIfLoop(arg : String) {
    if(arg == "SaN") {
        println("If condition executed")
    } else if(arg == "SANTHOSH") {
        println("If Else If condition executed")
    } else {
        println("If condition executed")
    }
}

fun ifElseLoop(arg : String) {
    if(arg == "SANTHOSH") {
        println("If condition executed")
    } else {
        println("Else condition executed")
    }
}

fun ifLoop(arg : String) {
    if(arg == "SANTHOSH") {
        println("If condition executed")
    }
    var ternary = if(10 > 20) "It is not greater" else  "It is greater"
    println("check this line to see how if else is used as ternary")
}

fun strings(str : String) {
    println("Length of the string ${str.length}")
    println("Access first char with index ${str[0]}")
    println("String to uppercase ${str.uppercase()}")
    println("String to lowercase ${str.lowercase()}")
    println("Compare Strings ${str.compareTo("SANTHOSH")}")
    println("Compare Strings ${str.uppercase().compareTo("SANTHOSH")}")
    println("index of the starting char/string ${"I Love Programming".indexOf("Love")}")
    println("index of the starting char/string ${"I"} ${"Love"} ${"Programming"}")
    println("I" + " " + "Love" + " " + "Programming")
}

fun operators(operatorType : String) {
    var a : Int = 100
    var b : Int = 50
    /* when statement is like switch in Java */
    when (operatorType) {
        "ADD" -> println("Addition :: ${a+b}")
        "SUB" -> println("Subtraction :: ${a-b}")
        "MUL" -> println("Multiplication :: ${a*b}")
        "DIV" -> println("Division :: ${a/b}")
        "MOD" -> println("Modulus :: ${a%b}")
        "POST-INC" -> println("Post Increment :: ${a++}")
        "PRE-INC" -> println("Pre Increment :: ${++a}")
        "POST-DEC" -> println("Post Decrement :: ${a--}")
        "PRE-DEC" -> println("Pre Decrement :: ${--a}")
        "EQU" -> println("Equals :: ${a == b}")
        "NOT-EQU" -> println("Not Equals :: ${a != b}")
        "GREATER" -> println("Greater :: ${a > b}")
        "LESSER" -> println("Lesser :: ${a < b}")
        "GREATER-EQU" -> println("Greater Equals :: ${a >= b}")
        "LESSER-EQU" -> println("Lesser Equals :: ${a <= b}")
        "AND" -> println("AND :: ${a == 100 && b == 50}")
        "OR" -> println("OR :: ${a == 100 || b == 50}")
        "NOT" -> println("NOT :: ${!(a == 100)}")
    }
}

fun typeConversions() {
    var myByte : Byte = 100
    println("converting Byte to Int ${myByte.toInt()}")
    println("converting Byte to Long ${myByte.toLong()}")
    println("converting Byte to Double ${myByte.toDouble()}")
    var myInt : Int = 10000
    println("converting Int to Byte ${myInt.toByte()}") /* It will fit between -127 to 128 */
    var myDouble : Double = 1000.12345667788
    println("converting Int to Byte ${myDouble.toInt().toByte()}") /* It will fit between -127 to 128 */
}

fun dataTypes() {
    var myByte : Byte = 100
    var myShort : Short = 1000
    var myInt : Int = 10000
    var myLong : Long = 1000000
    var myFloat : Float = 104.123456F
    var myDouble : Double = 10.02454365464
    var myChar : Char = 'S'
    var myString : String = "Santhosh"
    var myBoolean : Boolean = true
    println("Byte : ${myByte} -- Short : ${myShort} -- Int : ${myInt} -- Long : ${myLong} -- Float : ${myFloat} -- Double : ${myDouble}" +
            " -- Char : ${myChar} -- String : ${myString} -- Boolean : ${myBoolean}")

}

fun varType() {
    var variable : Int = 10
    println("Var variable type :: ")
    println("Integer variable is assigned to $variable")
    println("We can modify the val variable once assigned and it is recommended")
    variable = 20
    println("Integer variable is modified to $variable")
    println("Variable should be initialized at the time of declaration, else we will get variable needs to be initialized error")
}

fun valType() {
    val variable : Int = 10
    println("Val variable type")
    println("Integer variable is assigned to $variable")
    println("We cannot modify the val variable once assigned and it is recommended")
}

/* return type of a function is Unit it means the function does not return anything */
fun alignStatements(isSwap : Boolean) : Unit {
    if(!isSwap) {
        printNewLine()
        printHashes()
    } else {
        printHashes()
        printNewLine()
    }
}

fun printNewLine() = println()

/* Below is the shorthand function to return/execute single line*/
fun printHashes() = println("########################################################################################################################################")



