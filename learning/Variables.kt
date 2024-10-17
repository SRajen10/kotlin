package learning

fun main(args: Array<String>) {
    var a : Int = 10
    var b : Float = 20.0F
    var c : Double = 30.0
    val d : Int = 40
    variablesWorkout(a, b, c, d)
}

fun variablesWorkout(a : Int, b : Float, c : Double, d : Int) {
    
    print("sum of $a + $b + $c + $d is equal to ${a+b+c+d}")
    
/* Changing below values will throw compilation error */
    //    val z : Double = 20.0;
    //    z = a+b+c
    
}