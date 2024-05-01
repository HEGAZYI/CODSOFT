package codsoft;

import java.util.*;

public class task4 {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("JPY", 109.59);
    }

    public static void main(String[] args) {
        try( Scanner scanner = new Scanner(System.in)){

        System.out.println("Enter the base currency :");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.println("Enter the target currency :");
        String targetCurrency = scanner.nextLine().toUpperCase();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Failed to fetch exchange rate.");
            return;
        }

        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        double convertedAmount = amount * exchangeRate;

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
    }
}

    public static double getExchangeRate(String baseCurrency, String targetCurrency) {

        if (exchangeRates.containsKey(baseCurrency) && exchangeRates.containsKey(targetCurrency)) {
            double baseRate = exchangeRates.get(baseCurrency);
            double targetRate = exchangeRates.get(targetCurrency);
            return targetRate / baseRate;
        } else {
            return -1;
        }
    }
}


