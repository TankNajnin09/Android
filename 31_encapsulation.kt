class BankAccount(initialBalance: Double) {

    // Private property (data hiding)
    private var balance: Double = initialBalance

    // Public method to deposit money
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount")
        } else {
            println("Invalid deposit amount")
        }
    }

    // Public method to withdraw money
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawn: $amount")
        } else {
            println("Invalid or insufficient balance")
        }
    }

    // Public method to check balance
    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount(1000.0)

    account.deposit(500.0)
    account.withdraw(300.0)

    println("Current Balance: ${account.getBalance()}")
}
