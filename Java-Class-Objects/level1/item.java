class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode + ", Name: " + itemName + ", Price: ₹" + price);
        System.out.println("Quantity: " + quantity + ", Total Cost: ₹" + totalCost);
    }

    public static void main(String[] args) {
        Item item = new Item(501, "Notebook", 45);
        item.displayDetails(10);
    }
}
