package app._03_task;

import java.util.Scanner;

public class Main {

    static double ttlPrice;
    static double avPrice;
    static int DAYS = 10;

    public static void main(String[] args) {
        double[] price = getData();
        getAveragePrice(price);
        avPrice = getAveragePrice(price);
        getOutput();
    }

    public static double[] getData() {
        Scanner scan = new Scanner(System.in);
        double[] price = new double[DAYS];
        for (int i = 0; i < price.length; i++) {
            System.out.printf("Enter price value on day %d: ", (i + 1));
            price[i] = scan.nextDouble();
        }
        return price;
    }

    public static double getAveragePrice(double[] price) {
        for (double pr : price) {
            ttlPrice += pr;
        }
        return ttlPrice / price.length;
    }

    public static void getOutput() {

        System.out.printf("---------------%n" +
                "Total price, UAH: %.2f%nAverage price, UAH: %.2f", ttlPrice, avPrice);
    }


}
