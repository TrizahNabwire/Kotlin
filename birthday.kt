fun main(){
    val age = 19
    val layers = 7
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)

}


fun printCakeCandles(age: Int) {
    repeat(age) {
        print(",")
    }
    println()

    print("")
    repeat(age) {
        print("|")
    }
    println("")
}

fun printCakeTop(age: Int) {
    print("")
    repeat(age + 4) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(age + 2){
        print("@")
    }
    println("")
}

