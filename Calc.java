public class Calc {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    private static double readValidDouble(java.util.Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double firstNumber = readValidDouble(scanner, "Please enter the first number: \n");
        double secondNumber = readValidDouble(scanner, "Please enter the second number: \n");

        Calc calculator = new Calc();
        calculator.setNum1(firstNumber);
        calculator.setNum2(secondNumber);

        System.out.println(calculator.toString());
        System.out.println("Calling num1 get method: " + calculator.getNum1());
        System.out.println("Calling num2 get method: " + calculator.getNum2());
        System.out.println("The sum is: " + calculator.add());
        System.out.println("The difference is: " + calculator.subtract());
        System.out.println("The product is: " + calculator.multiply());
        System.out.println("The quotient is: " + calculator.divide());

        scanner.close();
    }

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}
