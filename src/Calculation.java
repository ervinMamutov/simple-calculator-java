public class Calculation
{
    public static double counting (double first, double second, char operator)
    {
        double result = 0.0;
        switch (operator)
        {
            case '*':
                result = first * second;
                break;
            case '/':
                if (second == 0)
                {

                    return Double.NaN;
                }
                result = first / second;
                break;
            case'+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
        }

        return result;
    }
}