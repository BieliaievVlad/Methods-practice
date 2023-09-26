package app._05_task;

public class Calculation {

    public String getTariff(double weight) {
        if (weight > 0 & weight <= Main.maxWeight1) {
            return "\nBaggage fee, UAH: 50.00";
        } else if (weight <= Main.maxWeight2) {
            return "\nBaggage fee, UAH: 150.00";
        } else {
            return "\nBaggage fee, UAH: 450.00";
        }
    }
}

