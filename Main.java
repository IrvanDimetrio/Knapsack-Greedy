package knapsack_greedy;
// Dibuat Oleh : Muhamad Irvan Dimetrio

import java.util.*;

public class Main {

    static container container = new container(160);
    static Item item1 = new Item(100, 40);
    static Item item2 = new Item(50, 35);
    static Item item3 = new Item(45, 18);
    static Item item4 = new Item(20, 4);
    static Item item5 = new Item(10, 10);
    static Item item6 = new Item(5, 2);
    static List<Item> items = new ArrayList<Item>();

    public static void main(String[] args) {
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        System.out.println("Strategy 1 - First the highest value: ");
        System.out.println("Total price = " + container.getStrategy1(items));
        System.out.println("\nStrategy 2 - First the least heavy: ");
        System.out.println("Total price = " + container.getStrategy2(items));
        System.out.println("\nStrategy 3 - Calculation of dollar/kg: ");
        System.out.println("Total price = " + container.getStrategy3(items));
    }
}
