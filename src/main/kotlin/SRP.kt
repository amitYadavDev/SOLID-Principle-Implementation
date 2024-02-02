// The Single Responsibility Principle (SRP):
//This principle states that "A class should have only one reason to change"
//This means that one class should only have one responsibility.


// this class has 2 responsibility, so it's not following the SRP.
class Square1 {
    // These methods are belong to square that's good
    fun calculateArea(side: Int): Int {
        return side * side
    }

    fun calculatePerimeter(side: Int): Int {
        return 4 * side
    }

    // But these methods don't belong to square. these are belong to Ui
    fun renderSquare() {
        println("Render Square")
    }

    fun renderLargeSquare() {
        println("Render Large Square")
    }
}


// Below classes have single responsibility so these follow the SRP.

class Square {
    fun calculateArea(side: Int): Int {
        return side * side
    }

    fun calculatePerimeter(side: Int): Int {
        return 4 * side
    }
}

class SquareUi {
    fun renderSquare() {
        println("Render Square")
    }

    fun renderLargeSquare() {
        println("Render Large Square")
    }
}

fun main(args: Array<String>) {

}