package app._04_task;

public class Calculation {

    public String getTariff(double weight) {
        if (weight > 0 & weight <= 25) {
            return "Baggage fee, UAH: 50.00";
        } else if (weight <= 50) {
            return "Baggage fee, UAH: 150.00";
        } else {
            return "Baggage fee, UAH: 450.00";
        }
    }
}
