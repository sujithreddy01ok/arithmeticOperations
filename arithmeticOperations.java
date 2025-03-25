public class arithmeticOperations {

    public static void main(String[] args) {
        // Initialize two numbers directly
        double num1 = 10; // Example number 1
        double num2 = 5;  // Example number 2
       
        // Perform basic arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
       
        // Display the results
        System.out.println("Results:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
       
        // Check if division is possible (avoid division by zero)
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
    }
}
