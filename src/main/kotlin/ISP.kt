// Don't implement too fatty interface

// This principle states that "The interface-segregation principle (ISP) states 
// - that no client should be forced to depend on methods it does not use."

// This means that if an interface becomes too fat, then it should be split into smaller 
// - interfaces so that the client implementing the interface does 
// - not implement methods that are of no use to it.

// this interface is too fatty
interface IMultiFunctional{
    fun print()
    fun printSpoonDetails()
    fun scan()
    fun scanPhoto()
    fun fax()
    fun internetFax()
}

class CannonPrinter: IMultiFunctional {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

    // cannon printer doesn't have this functionality, still we have to add this method
    override fun fax() {
        TODO("Not yet implemented")
    }

    // cannon printer doesn't have this functionality, still we have to add this method
    override fun internetFax() {
        TODO("Not yet implemented")
    }

}

// now split the fatty interface to smaller on
interface IPrint {
    fun print()
    fun printSpoonDetails()
}

interface IScan {
    fun scan()
    fun scanPhoto()
}

interface IFax {
    fun fax()
    fun internetFax()
}

// printer can scan and print so use only necessary interface (Follows Interface Segregation Principle)
class CannonPrinter1: IPrint, IScan {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoonDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

}




class ISP {
}
