//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates
        double usdToEur = 0.85;
        double usdToGbp = 0.75;
        double usdToInr = 74.50;

        System.out.println("Welcome to the Currency Converter!");

        while (true) {
            System.out.println("\nAvailable currencies: USD, EUR, GBP, INR");
            System.out.print("Enter the currency you have: ");
            String fromCurrency = scanner.next().toUpperCase();
            System.out.print("Enter the currency you want: ");
            String toCurrency = scanner.next().toUpperCase();
            System.out.print("Enter the amount you want to convert: ");
            double amount = scanner.nextDouble();

            double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount, usdToEur, usdToGbp, usdToInr);
            if (convertedAmount != -1) {
                System.out.printf("Converted amount: %.2f %s%n", convertedAmount, toCurrency);
            } else {
                System.out.println("Invalid currency conversion requested.");
            }

            System.out.print("Do you want to convert another amount? (yes/no): ");
            String continueConversion = scanner.next().toLowerCase();
            if (!continueConversion.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using the Currency Converter. Goodbye!");
        scanner.close();
    }

    public static double convertCurrency(String fromCurrency, String toCurrency, double amount, double usdToEur, double usdToGbp, double usdToInr) {
        // Convert from the source currency to USD
        double amountInUsd = 0;
        switch (fromCurrency) {
            case "USD":
                amountInUsd = amount;
                break;
            case "EUR":
                amountInUsd = amount / usdToEur;
                break;
            case "GBP":
                amountInUsd = amount / usdToGbp;
                break;
            case "INR":
                amountInUsd = amount / usdToInr;
                break;
            default:
                return -1; // Invalid source currency
        }

        // Convert from USD to the target currency
        switch (toCurrency) {
            case "USD":
                return amountInUsd;
            case "EUR":
                return amountInUsd * usdToEur;
            case "GBP":
                return amountInUsd * usdToGbp;
            case "INR":
                return amountInUsd * usdToInr;
            default:
                return -1; // Invalid target currency
        }
    }
}