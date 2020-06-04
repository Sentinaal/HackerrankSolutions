import java.util.*;


public class Day2 {

    // Complete the solve function below.
    static int solve(double meal_cost, int tip_percent, int tax_percent) {
        double finalTip = (double) tip_percent/100 * meal_cost;
        double finalTax = (double) tax_percent/100 * meal_cost;
        double totalCost = meal_cost + finalTip + finalTax;
        int finalCost = (int)Math.round(totalCost);
        return finalCost;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.print(solve(meal_cost, tip_percent, tax_percent));

        scanner.close();
    }
}
