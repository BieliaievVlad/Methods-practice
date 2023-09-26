package app._02_task;

import java.util.Scanner;

public class Main {

    static String name;
    static double weight;
    static int quantity;
    static int damage;
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
        System.out.printf("Enter product weight, %s: ",UNIT);
        String weight = scan.nextLine();
        System.out.print("Enter product quantity: ");
        String quantity = scan.nextLine();
        System.out.print("Enter estimated percentage of product damage, %: ");
        String damage = scan.nextLine();
        return new String[]{name, weight, quantity, damage};
    }

    public static void serviceData(String[] product) {
        name = product[0];
        weight = Double.parseDouble(product[1]);
        quantity = Integer.parseInt(product[2]);
        damage = Integer.parseInt(product[3]);
    }

    public static double calcTotalWeight() {
        return weight * quantity;
    }

    public static double calcDamage() {
        return calcTotalWeight() * damage / 100;
    }

    public static void getOutput() {
        System.out.printf("---------------%n" +
                        "Name: %s%nWeight: %.3f %s%nQuantity: %d%nTotal weight: %.3f %s" +
                        "%nEstimated product damage: %.3f %s",
                name, weight, UNIT, quantity, calcTotalWeight(), UNIT, calcDamage(), UNIT);

    }

}
