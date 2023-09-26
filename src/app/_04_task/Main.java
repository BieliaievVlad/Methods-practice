package app._04_task;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double weight;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        Calculation calculation = new Calculation();

        System.out.print("Enter weight value, kg: ");
        weight = scan.nextDouble();
        scan.close();

        System.out.println(calculation.getTariff(weight));

    }
}
