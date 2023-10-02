import java.util.ArrayList;

public class Item {

    private ArrayList<String> itemList;

    public Item() {
        itemList = new ArrayList<>();
    }

    public class Items {
        private String itemName;
        private String itemDescription;

        public Items(String itemName, String itemDescription) {
            this.itemName = itemName;
            this.itemDescription = itemDescription;
        }

        public String getItemName() {
            return itemName;
        }

        public String getItemDescription() {
            return itemDescription;
        }

        public void addItem(Item.Items items){
            addItem(items);
        }

        public ArrayList<Items> getItem(){
            return itemList;
        }

    }
}
