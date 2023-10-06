import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private Room currentRoom;

    private Item inventory;


    Scanner keyboard = new Scanner(System.in);


    public Player(Room currentRoom){
        this.currentRoom = currentRoom;
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


    public void dropItem(String dropItem){
        Item dropItemToRoom = null;
        for(Item item : inventory){
            if(item.getItemName().toLowerCase().contains(dropItem.toLowerCase()))
        }
    }
    public void setCurrentRoom(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getRoomDescription();
    }

    ArrayList<Item> Inventory = new ArrayList<>();

    public ArrayList<Item>ShowInventory(){
        return Inventory;
    }



}



