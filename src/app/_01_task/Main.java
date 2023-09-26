package app._01_task;

import java.util.Scanner;

public class Main {

    static String name;
    static double weight;
    static int quantity;
    static String UNIT = "kg";

    public static void main(String[] args) {

        String[] product = getData();
        serviceData(product);
        getOutput();


    }

    public static String[] getData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scan.nextLine().trim();
        System.out.print("Enter product weight: ");
        String weight = scan.nextLine();
        System.out.print("Enter product quantity: ");
        String quantity = scan.nextLine();
        return new String[]{name, weight, quantity};
    }

    public static void serviceData(String[] product) {
        name = product[0];
        weight = Double.parseDouble(product[1]);
        quantity = Integer.parseInt(product[2]);
    }

    public static double calcTotalWeight() {
        return weight * quantity;
    }

    public static void getOutput() {
        System.out.printf("---------------%n" +
                        "Name: %s%nWeight: %.3f %s%nQuantity: %d%nTotal weight: %.3f%s",
                name, weight, UNIT, quantity, calcTotalWeight(), UNIT);

    }

}
