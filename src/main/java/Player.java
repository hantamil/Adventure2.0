import java.util.ArrayList;

public class Player {

    private Room currentRoom;

    private ArrayList<Item> inventory;

   public Player(Room currentRoom){
       this.currentRoom = currentRoom;
       inventory = new ArrayList<>();
   }

   public ArrayList<Item> getInventory(){
       return inventory;
   }

   public void takeItem(Item item){
       inventory.add(item);
   }
   /*
    public boolean takeItem(String itemName){
        Item takeFromRoom = currentRoom.removeItem(itemName);
        if (takeFromRoom != null){
            inventory.add(takeFromRoom);
            return true;
        }
        return false;
    }
 */

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
}



