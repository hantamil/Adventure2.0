import java.util.ArrayList;

public class Player {
    private Room currentRoom;
    private ArrayList<Item> inventory;
    private int health;
    private Player attack;
    private Weapon currentWeapon;

    public Player(Room currentRoom) {
       this.currentRoom = currentRoom;
       this.inventory = new ArrayList<>();
       this.health = 100;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getRoomDescription();
    }

    public int getHealth() {
        return health;
    }

    public String move(String direction) {
        Room nextRoom = null;
        switch (direction) {
            case "n", "north":
                nextRoom = currentRoom.getNorth();
                break;
            case "s", "south":
                nextRoom = currentRoom.getSouth();
                break;
            case "e", "east":
                nextRoom = currentRoom.getEast();
                break;
            case "w", "west":
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

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public boolean takeItem (String itemName){
        for (Item item : currentRoom.getItemList()){
            if (item.getItemName().toLowerCase().equals(itemName)){
                getInventory().add(item);
                currentRoom.getItemList().remove(item);
                return true;
            }
        }
        return false;
    }

    public Item findItem (String itemName) {
        for (Item item : inventory){
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void dropItem (Item item) {
        inventory.remove(item);
    }

    public Player dropItem (String itemName) {
        Item item = findItem(itemName);
        if (item != null) {
            dropItem(item);
            currentRoom.addItem(item);
            System.out.println("You dropped " + item.getItemName());
        } else {
            System.out.println("You don't have a " + itemName + " in your bag.");
        }
        return null;
    }

    public Player viewInventory() {
        ArrayList<Item> inventory = getInventory();
        if (inventory.isEmpty()){
            System.out.println("There is nothing in your bag.");
        }else {
            System.out.println("Inventory");
            for (Item item : inventory) {
                System.out.println(item.getItemName() + item.getItemDescription());
            }
        }
        return null;
    }

    public void setHealth(Item item) {
        if (item instanceof Food) {
            this.health += ((Food) item).getHealthPoints();
        }
        if (health > 100) {
            health = 100;
        }
    }

    public String healthDescription() {
        String healthPoints = "";
        if (health > 0 && health <= 20) {
            healthPoints = "You are very weak and should eat something immediately. \nAvoid fighting since this could kill you. ";
        }
        if (health > 20 && health <= 50) {
            healthPoints = "You still have some strength left, but be careful not to fight too much.\nIf you have something to eat now would be the time to do so otherwise you might start looking.";
        }
        if (health > 50 && health <= 70) {
            healthPoints = "You are healthy and have your normal strength.";
        }
        if (health > 70 && health <= 90) {
            healthPoints = "You are very healthy and have lots of strength and energy to fight or explore the lands.";
        }
        if (health > 90 && health <= 100) {
            healthPoints = "You are at your full strength and feel like nothing can stop you!";
        }
        return healthPoints;
    }

    public FoodEnum eatFood(String itemName) {
        Item eatItem = findItem(itemName);
        if (eatItem instanceof Food) {
            setHealth(eatItem);
            inventory.remove(eatItem);
            return FoodEnum.FOOD;
        } else if (eatItem == null) {
            return FoodEnum.NOT_FOUND;
        } else {
            return FoodEnum.NO_FOOD;
        }
    }

}



