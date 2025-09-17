//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        double first = userInput.getNumber();
        char operator = userInput.getOperation();
        double second = userInput.getNumber();

        double result = Calculation.counting(first, second, operator);
        if (Double.isNaN((result)))
        {
            System.out.println("Error: invalid calculation (division by zero or bad operator)");
        }
        else
        {
            System.out.printf("%.2f %c %.2f = %.2f%n", first, operator, second, result);
        }
        userInput.scannerClose();
    }
}