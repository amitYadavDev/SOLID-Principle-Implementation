//The Open-Closed Principle (OCP):

//This principle states that "Software entities such as classes, functions,
// modules should be open for extension but not for modification."

//This means that if we are required to add a new feature to the project,
// it is good practice to not modify the existing code but rather write new code in a seperate module
// and that will be used by the existing code.

class VehicleInsuranceCustomer1 {
    fun isLoyalCustomer(): Boolean {
        return true
    }
}

class HomeInsuranceCustomer1 {
    fun isLoyalCustomer(): Boolean {
        return true
    }
}

class LifeInsuranceCustomer1 {
    fun isLoyalCustomer(): Boolean {
        return true
    }
}

class InsuranceCompany1 {
    fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer1): Int {
        return if(vehicleInsuranceCustomer.isLoyalCustomer()) 30
        else 10
    }

    fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer1): Int {
        return if(homeInsuranceCustomer.isLoyalCustomer()) 40
        else 12
    }

    fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer1): Int {
        return if(lifeInsuranceCustomer.isLoyalCustomer()) 35
        else 15
    }
}

// in above class isLoyalCustomer() is written multiple times so duplicate codes


// let's convert to Open for extension and Closed for modification

interface Customer {
    fun isLoyalCustomer(): Boolean
}

class VehicleInsuranceCustomer: Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}

class HomeInsuranceCustomer: Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}

class LifeInsuranceCustomer: Customer {
    override fun isLoyalCustomer(): Boolean {
        return true
    }
}

class InsuranceCompany {
    fun discountRate(customer: Customer): Int {
        return if(customer.isLoyalCustomer()) 40 else 15
    }
}

fun main() {
    val lifeInsuranceCustomer = LifeInsuranceCustomer()
    val homeInsuranceCustomer = HomeInsuranceCustomer()
    val vehicleInsuranceCustomer = VehicleInsuranceCustomer()

    val insuranceCompany = InsuranceCompany()

    insuranceCompany.discountRate(lifeInsuranceCustomer)
    insuranceCompany.discountRate(homeInsuranceCustomer)
    insuranceCompany.discountRate(vehicleInsuranceCustomer)
}



