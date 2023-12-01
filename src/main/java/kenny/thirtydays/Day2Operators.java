package kenny.thirtydays;

public class Day2Operators {
    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tipAmount =  meal_cost * tip_percent/100;
        double taxAmount =  meal_cost *tax_percent/100;
        double totalAmount = meal_cost + tipAmount + taxAmount;
        int roundTotal = (int) Math.round(totalAmount);
        System.out.println(roundTotal);
    }
}
