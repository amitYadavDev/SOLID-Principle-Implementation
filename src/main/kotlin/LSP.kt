open class Vehicle {
    open fun getInteriorWidth(): Int {
       return 0
    }
}

open class Car: Vehicle() {
    override fun getInteriorWidth(): Int {
        return this.getCabinWidth()
    }
    fun getCabinWidth(): Int {
        return 40
    }
}

class RacingCar: Vehicle() {
    override fun getInteriorWidth(): Int {
        return this.cockpitWidth()
    }
    fun cockpitWidth(): Int {
        return 10
    }
}

fun main() {
    val list = mutableListOf(RacingCar(), Car())
// I need to check for each class one by one, that's not a good idea
    list.forEach {
        when(it) {
            is RacingCar -> {
                println(it.cockpitWidth())
            }
            is Car -> {
                println(it.getCabinWidth())
            }
        }
    }

    // now I implemented Vehicle class(that follows Liskov principle)
    list.forEach {
        println(it.getInteriorWidth())
    }
}

class LSP {
}