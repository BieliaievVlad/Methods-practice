package app._05_task;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double weight;
    static double maxWeight1;
    static double maxWeight2;

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("Our airline uses 3 tariffs for baggage transportation." +
                "\nEnter the weight value that corresponds to the first tariff, kg: ");
        maxWeight1 = scan.nextDouble();
        System.out.printf("Weight limit for the first tariff, kg: %.3f" +
                "%nEnter the weight value that corresponds to the second tariff, kg: ", maxWeight1);
        maxWeight2 = scan.nextDouble();
        System.out.printf("Weight limit for the second tariff, kg: %.3f" +
                "%nWeight value for the third tariff is above %.3f kg.", maxWeight2, maxWeight2);

        System.out.print("\n-----------------" +
                "\nEnter your baggage weight, kg: ");
        weight = scan.nextDouble();
        scan.close();

        System.out.print("--------------" + calculation.getTariff(weight));
    }
}
