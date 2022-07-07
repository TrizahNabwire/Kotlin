
fun main(){
    val border= "|"
    val timesToRepeat = 25
    printBorder(border, timesToRepeat)
    println("HAPPY BIRTHDAY TRIZAH")
    printBorder(border, timesToRepeat)
}
fun printBorder(border: String, timesToRepeat: Int){
        repeat(timesToRepeat){
            print(border)

    }
    println()
}