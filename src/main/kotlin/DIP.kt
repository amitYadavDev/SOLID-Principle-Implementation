// This principle has 2 requirements:
// "High-level modules should not depend on low-level modules. Both should depend on abstractions"
// "Abstractions should not depend upon details. Details should depend upon abstractions"

// This means that if you use a class insider another class, this class will be dependent of the class injected. This is what is called rigidity.


// high level module
class ProductCatalog {
    fun listAllProducts() {
//        val sql: IProductRepo = SQLProductRepo()
        val sql: IProductRepo = MongoProductRepo()
        sql.getAllProducts().forEach{
            println(it)
        }
    }

}


// low level module
class SQLProductRepo: IProductRepo {
    override fun getAllProducts(): MutableList<String> {
        return mutableListOf("Apple", "Lemon", "Mango")
    }
}
class MongoProductRepo: IProductRepo {
    override fun getAllProducts(): MutableList<String> {
        return mutableListOf("Onion", "Garlic", "Ginger")
    }
}
// lower and high both should depend upon abstraction
interface IProductRepo {
    fun getAllProducts(): MutableList<String>
}


fun main() {
    val productCatalog = ProductCatalog()
    productCatalog.listAllProducts()
}

class DIP {
}
