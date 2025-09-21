public class Calculation
{
    private final double first;
    private final double second;
    private final char operator;

    public Calculation(double first, double second, char operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
    }


    public double counting() {
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