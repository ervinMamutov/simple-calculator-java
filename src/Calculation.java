public class Calculation
{
    public double counting (double first, double second, char operator)
    {
        return switch (operator)
        {
            case '*' -> first * second;
            case '/' -> (second == 0) ? Double.NaN : first / second;
            case '+' -> first + second;
            case '-' -> first - second;
            default -> Double.NaN;
        };
    }
}