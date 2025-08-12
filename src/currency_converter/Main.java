package currency_converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("Введите сумму: ");
        double amount = scanner.nextInt();

        System.out.println("Из валюты (USD, EUR, KZT, RUB):");
        String fromCountry = scanner.next().toUpperCase();


        System.out.println("В валюты (USD, EUR, KZT, RUB):");
        String inCountry = scanner.next().toUpperCase();

        System.out.println("Результат: " + currencyConverter.convert(amount, fromCountry, inCountry));
    }
}
