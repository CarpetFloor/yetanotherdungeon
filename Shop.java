import java.util.LinkedList;

public class Shop extends Room{
    private LinkedList<Item> inventory;

    public Shop(int depth) {
        super(depth);
        inventory = new LinkedList<Item>();

        generateInventory();
    }

    public void generateInventory() {
        int itemCount = (int) ((Math.random() * (5 - 3)) + 3);

        if(inventory.size() > 0) {
            inventory.clear();
        }

        for(int i = 0; i < itemCount; i++) {
            inventory.add(new Item());
        }
    }
}
