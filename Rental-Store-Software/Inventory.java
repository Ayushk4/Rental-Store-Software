import java.util.ArrayList;
import java.util.Date;

public class Inventory {
    public ArrayList<Item> itemsList; // Hold all the assoiated items.

    // The constructor class for Inventory
    public Inventory() {
        this.itemsList = new ArrayList<Item>();
//        For testing;
        Item item = new Item("Item1", 500, 10000, "CD", "VHS");
        itemsList.add(item);
        item = new Item("Item2", 500, 10000, "CD", "VHS");
        itemsList.add(item);
        item = new Item("Item3", 500, 10000, "CD", "VHS");
        itemsList.add(item);
        item = new Item("Item4", 500, 10000, "CD", "VHS");
        itemsList.add(item);

    }

    /**
     * Function to add Item to inventory.
     * 
     * @param itemName    String
     * @param rentalPrice Integer
     * @param costPrice   Integer
     * @param itemType    String
     * @param itemFormat  String
     * @return Item
     */
    public Item addItem(String itemName, int rentalPrice, int costPrice, String itemType, String itemFormat) {
        Item newItem = new Item(itemName, rentalPrice, costPrice, itemType, itemFormat);
        itemsList.add(newItem);
        return newItem;
    }

    /**
     * Searches for the item with the passed parameter and deletes it from the
     * inventory
     * 
     * @param itemName String
     */
    public boolean deleteItem(String itemName) {
        for (int i = 0; i < this.itemsList.size(); i++) {
            if (itemsList.get(i).getItemName().toLowerCase() == itemName.toLowerCase()) {
                itemsList.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Marks an item issued by a customer.
     * 
     * @param itemName String
     * @param customer String
     * @return Boolean
     */
    public boolean issueAnItem(String itemName, String customer) {
        for (int i = 0; i < this.itemsList.size(); i++) {
            if (itemsList.get(i).getItemName().toLowerCase().compareTo(itemName.toLowerCase()) == 0) {
                return (itemsList.get(i).issueItem(customer));
            }
        }
        return false;
    }

    /**
     * The function will be called time to time by a thread in the main class. It
     * will look for Items not been issued for 1 year and sell them. Also looks
     */
    public void reducePriceAndSellItems() {
        Date currentDate = new Date();
        for (int i = 0; i < this.itemsList.size(); i++) {
            if (itemsList.get(i).yearlyCheck(currentDate)) {
                System.out.println("Removing " + itemsList.get(i).getItemName());
                itemsList.remove(i);
            }
        }
    }

    public ArrayList<Item> Search(String query, String itemFormat, String itemType) {

        ArrayList<Item> searchedItems = new ArrayList<Item>();
        int maxdist = 0;
        for (int i = 0; i < this.itemsList.size(); i++) {
            if (this.itemsList.get(i).getItemFormat().toLowerCase() != itemFormat.toLowerCase()
                    || this.itemsList.get(i).getItemType().toLowerCase() != itemType.toLowerCase()) {

                continue;
            }
            int this_dist = compareStringsSimilarity(this.itemsList.get(i).getItemName(), query);
            if (searchedItems.size() < 5) {
                maxdist = Math.max(maxdist, this_dist);
                searchedItems.add(this.itemsList.get(i));
            } else {
                if (this_dist < maxdist) {
                    for (int j = 0; j < searchedItems.size(); j++) {
                        if (maxdist == compareStringsSimilarity(searchedItems.get(j).getItemName(), query)) {
                            searchedItems.remove(j);
                            searchedItems.add(this.itemsList.get(i));
                            j = searchedItems.size() + 1;
                        }
                    }
                }
            }
        }

        return searchedItems;
    }

    // Helper function for checking string similarity
    private int compareStringsSimilarity(String a, String b) {

        if (a.toLowerCase() == b.toLowerCase()) {
            return 0;
        }
        String[] a_list = a.split(" ");
        String[] b_list = b.split(" ");

        int avg_dist = 0;
        for (int i = 0; i < b_list.length; i++) {
            int min_dist = 1000;
            for (int j = 0; j < a_list.length; j++) {
                int dist = levenshteinDistance(b_list[i].toLowerCase(), a_list[j].toLowerCase());
                if (dist == 0) {
                    return 1;
                }
                if (min_dist > dist) {
                    min_dist = dist;
                }
            }

            avg_dist += min_dist;

        }
        avg_dist /= b_list.length;

        return avg_dist;
    }

    // Calculates levenshtein Distance between strings.
    public int levenshteinDistance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] costs = new int[b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]),
                        a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }
}

// To-Do: Reduce the price to half after 1 year -> Called by a thread in main
// To-Do: Remove non issued items after one year -> Called by a thread in main
