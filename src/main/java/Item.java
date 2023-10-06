import java.util.ArrayList;
import java.util.List;

public class Item {

    private String itemName;

    private String itemDescription;

    public Item(String itemName, String itemDescription) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    public Item(String itemName){
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }


    public void setItemDescription(String itemDescription ){
        this.itemDescription = itemDescription;
    }


    public void setItemNamen(String itemName){
        this.itemName = itemName;
    }

@Override
    public String toString() {
        return
                itemName + " "
                        + itemDescription + " " + "\n";
    }




}
