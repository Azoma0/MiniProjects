package currency_converter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> currency;

    public CurrencyConverter(){
        this.currency = new HashMap<>();
        this.currency.put("USD", 540.97);
        this.currency.put("UK", 627.95);
        this.currency.put("KZT", 1.0);
        this.currency.put("RUB", 6.79);
    }

//    public void addCurrency(String country, Double sum){
//        this.currency.put(country, sum);
//        System.out.println("Данные добавились :" + country + "; " + sum + ";");
//    }

    public void printAvailableCurrencies(){
        System.out.println("Доступные валюты: " + this.currency.keySet());
    }

    public double convert( Double amount, String fromCurrenty, String inCurrenty){
        if(!currency.containsKey(fromCurrenty) || !currency.containsKey(inCurrenty)){
            System.out.println("Одна из валют не найдена. ");
            return 0.0;
        }
        double from = currency.get(fromCurrenty);
        double in = currency.get(inCurrenty);

        return (amount * from) / in;
    }
}
