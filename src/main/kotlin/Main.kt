/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 3, Task B
    Stop Light
 */

fun main(args: Array<String>) {

    println("Enter a colour code (1. Red, 2. Green, 3. Yellow)")
    var colour = readln().toInt()

    when (colour) {
        1 -> println("Next traffic light is Green")
        2 -> println("Next traffic light is Yellow")
        3 -> println("Next traffic light is Red")
        else -> println("Invalid colour")
    }

}