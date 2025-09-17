import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);
    public double getNumber() {
        double number;
        while (true)
        {
            System.out.println("Input number ");
            if (scanner.hasNextDouble())
            {
                number = scanner.nextDouble();
                break;
            }
            else
            {
                System.out.print("Invalid input. Please enter valid number");
                scanner.next();
            }
        }
        return number;
    }

    public char getOperation() {
        while (true)
        {
            System.out.println("Select what mathematical operation (*, /, +, -) would you like to perform?");
            String token = scanner.next().trim();
            if (token.length() != 1)
            {
               System.out.println("This operator is incorrect. Enter the correct operator");
               continue;
            }
            char operator = token.charAt(0);
            if ("*/+-".indexOf(operator) >= 0)
            {
                return operator;
            }
        }
    }

    public void scannerClose()
    {
        scanner.close();
    }
}
