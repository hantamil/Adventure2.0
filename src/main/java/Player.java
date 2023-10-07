import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private Room currentRoom;

    private ArrayList<Item> inventory;

    Scanner keyboard = new Scanner(System.in);


    public Player(Room currentRoom){
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();

    }



//
    public void viewInventory(){
        ArrayList<Item> Inventory = getInventory();
        if(inventory.isEmpty()){
            System.out.println("There is no item in your inventory..");
        } else{
            System.out.println("This the item in your inventory:");
            for(Item item : inventory){
                System.out.println("your items" + item.getItemName() + item.getItemDescription());
            }
        }

    }
///
   public boolean takeItem(String itemName) {
       Item item = null;
       for (Item items : inventory){
           if(item.getItemName().equalsIgnoreCase(itemName)){
               item = items;
           }
       }
       if (item != null) {
           inventory.add(item);
           currentRoom.removeItem(itemName);
       }
       return true;
   }


    public void dropItem (String itemName) {
        Item item = null;
        for (Item items : inventory) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item = items;
            }
        }
        if (item != null) {
            dropItem(itemName);
            currentRoom.addItem(item);
            System.out.println("you have drop" + itemName);
        }

    }


    public ArrayList<Item> getInventory(){
        return inventory;
    }


    public String move(String direction) {
        Room nextRoom = null;
        switch (direction) {
            case "n":
            case"north":
            case"go north":
                nextRoom = currentRoom.getNorth();
                break;
            case "s":
            case"south":
            case"go south":
                nextRoom = currentRoom.getSouth();
                break;
            case "e":
            case"east":
                case"go east":
                nextRoom = currentRoom.getEast();
                break;
            case "w":
            case "west":
                case"go west":
                nextRoom = currentRoom.getWest();
                break;
        }
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return currentRoom.getRoomDescription();
        } else {
            return "You have chosen a path that leads nowhere. Try a different path.";
        }
    }

    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getRoomDescription();
    }


/*
    public void showInventory(){
        ArrayList<Item> Inventory = new ArrayList<>();
    }


    public ArrayList<Item> getShowInventory(){
        return Inventory;
    }
    public void getInventory() {
        if (inventory != null) ;
        System.out.println(inventory);
    }

    public void drop(String itemName){
        Item item = null;
        for(Item items : inventory){
            if(items.getItemName().equalsIgnoreCase())
        }
    }

*/
}



