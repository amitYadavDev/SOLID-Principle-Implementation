
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