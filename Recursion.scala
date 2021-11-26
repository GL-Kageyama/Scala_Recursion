object Recursion extends App {

    // Basic recursion functions
    def factorial(n: BigInt): BigInt = {
        if (n <= 1) 1
        else n * factorial(n - 1)
    }

    val num1 = 100
    val num2 = 100000

    println("Factorial of " + num1 + " : = " + factorial(num1)) // Factorial of 100 : = 9332621544394415......
    // If the number of digits is too large, StackOverflow will occur.
    println("Factorial of " + num2 + " : = " + factorial(num2)) // Exception in thread "main" java.lang.StackOverflowError

}


// =====================================
//         Output Sample
// =====================================
// $ scalac Recursion.scala 
// $ scala Recursion
// Factorial of 100 : = 93326215443944152681699
// Exception in thread "main" java.lang.StackOverflowError
