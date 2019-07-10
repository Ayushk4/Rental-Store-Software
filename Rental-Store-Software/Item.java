import java.util.ArrayList;
import java.util.Date;

// Class
public class Item {

    private String itemName; // The name of the CD or DVD.
    private Date dateOfPurchase; // Initialized to the date item was added to inventory.
    private boolean pastOneYear; // Variable to tell if the data object has passed one year.
    private Date dateOfLastActivity; // Stores the date of last activty of the item
    private int rentalPrice; // The Rental Price for this item for each day.
    private int costPrice; // The Rental Price for
    private boolean issuedOnce; // This tells whether the item has been issued once or not.
    private String itemType; // CD or DVD
    private String itemFormat; // VHS or MP4 or Music
    private boolean itemStatus; // Tells the status of CD. true for issued, else false.
    private String customer; // Tells the customer that currently posses the item.

    // The constructor for class Item
    public Item(String itemName, int rentalPrice, int costPrice, String itemType, String itemFormat) {

        // this.id = id;
        this.itemName = itemName;
        this.dateOfPurchase = new Date();
        this.dateOfLastActivity = new Date();
        this.rentalPrice = rentalPrice;
        this.costPrice = costPrice;
        this.issuedOnce = false;
        this.itemType = itemType;

        if (itemFormat.toLowerCase().compareTo("vhs") != 0 && itemFormat.toLowerCase().compareTo("mp4") != 0
                && itemFormat.toLowerCase().compareTo("music") != 0) {
            // System.out.println(itemFormat);
            System.out.println("Warning! The format is not in VHS or MP4 or Music CD");
        }
        this.itemFormat = itemFormat.toLowerCase();
        this.itemStatus = false;
        this.customer = " ";
    }

    public Item(String itemName, Date dateOfPurchase, Date dateOfLastActivity, int rentalPrice, int costPrice,
            boolean issuedOnce, String itemType, String itemFormat, boolean itemStatus) {

        // this.id = id;
        this.itemName = itemName;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfLastActivity = dateOfLastActivity;
        this.rentalPrice = rentalPrice;
        this.costPrice = costPrice;
        this.issuedOnce = issuedOnce;
        this.itemType = itemType;
        this.itemFormat = itemFormat;
        this.itemStatus = itemStatus;
        this.customer = " ";
    }

    /**
     * Marks this items as issed, returns false if failed.
     */
    public boolean issueItem(String customer) {
        if (this.itemStatus == true) {
            System.out.println("This item - " + this.itemName + "has already been issued.");
            return false;
        }
        try {
            this.customer = customer;
            this.itemStatus = true;
            if (this.issuedOnce == false) {
                this.issuedOnce = true;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     * Halves the rentalPrice or removes the item - created to be used after one
     * year of being issued.
     */
    public boolean yearlyCheck(Date currentDate) {
        int yearDiff = (currentDate.getYear() - dateOfPurchase.getYear()) * 365;
        int monthDiff = (currentDate.getMonth() - dateOfPurchase.getMonth()) * 30;
        int dayDiff = (currentDate.getDay() - dateOfPurchase.getDay());
        int totalDiff = yearDiff + monthDiff + dayDiff;

        if (issuedOnce == false && (totalDiff >= 365)) {
            return true;
        }
        if ((pastOneYear == false) && (totalDiff >= 365)) {
            this.rentalPrice = this.rentalPrice / 2;
            pastOneYear = true;
        }
        return false;
    }

    /**
     * @return the itemName attribute
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return the dateOfPurchase attribute
     */
    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @return the rentalPrice attribute
     */
    public int getRentalPrice() {
        return rentalPrice;
    }

    /**
     * @return the last activity date attribute
     */
    public Date getDateOfLastActivity() {
        return dateOfLastActivity;
    }

    /**
     * @return the costPrice attribute
     */
    public int getCostPrice() {
        return costPrice;
    }

    /**
     * @return the issuedOnce attribute
     */
    public boolean getIssuedOnce() {
        return issuedOnce;
    }

    /**
     * @return the itemType attribute
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @return the itemFormat attribute
     */
    public String getItemFormat() {
        return itemFormat;
    }

    /**
     * @return the customer attribute
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @return the itemStatus attribute
     */
    public boolean getItemStatus() {
        return itemStatus;
    }

}